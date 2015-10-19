/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Spencer Cousino
 */
public class SudokuBoard {

    private int puzzleSize;
    Square[][] boardLayout;
    private DLinkedList boxes = new DLinkedList();

    public SudokuBoard(String filename) throws IOException {
        puzzleSize = 9;
        boardLayout = new Square[puzzleSize][puzzleSize];
        //Set up 3x3 grids using boxes
        for (int i = 0; i <= 6; i = i + 3) {
            for (int j = 0; j <= 6; j = j + 3) {
                Box newCage = new Box(i, j);
                boxes.add(newCage);
            }
        }

        //Read file to find already filled squares
        //Format:
        //1st line is the number of squares with data in them that the
        //puzzle starts with
        //
        //Subsequent lines hold the value of the filled square and its position
        //following this format:
        //1st line is the value of the square
        //next line is the position Ex: 0,1
        //
        //File example:
        //12
        //1
        //0,4
        //...
        FileReader fr = null;

        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("Error! File was not found.");
        }
        BufferedReader lineReader = new BufferedReader(fr);

        int numOfStartSquares = Integer.parseInt(lineReader.readLine());
        for (int i = 0; i < numOfStartSquares; i++) {
            int valOfStartSquare = Integer.parseInt(lineReader.readLine());
            String[] squarePos = new String[2];
            String squareLine;

            //Read in the row and column location of the square
            squareLine = lineReader.readLine();
            //Store row and column in string array
            squarePos = squareLine.split(",");

            //Change the row and column strings to integers
            int rowPos = Integer.parseInt(squarePos[0]);
            int columnPos = Integer.parseInt(squarePos[1]);

            privateAddStartSquare(rowPos, columnPos, valOfStartSquare);
        }

    }
    
    public SudokuBoard() {
        puzzleSize = 9;
        boardLayout = new Square[puzzleSize][puzzleSize];
        //Set up 3x3 grids using boxes
        for (int i = 0; i <= 6; i = i + 3) {
            for (int j = 0; j <= 6; j = j + 3) {
                Box newCage = new Box(i, j);
                boxes.add(newCage);
            }
        }
        
        
        
    }

    public Square getSquareAtPos(int row, int column) {
        return boardLayout[row][column];
    }

    public void addStartSquare(int row, int column, int data) {
        privateAddStartSquare(row, column, data);
    }
    
    private void privateAddStartSquare(int row, int column, int data) {
        Square currentSquare = new Square(row, column);
        currentSquare.setData(data);
        int squareCageID = determine3x3Grid(row, column);
        currentSquare.setCageID(squareCageID);
        currentSquare.setStartingSquare(true);
        boardLayout[row][column] = currentSquare;
    }

    public void addDataToSquare(int row, int column, int data) {
        Square currentSquare;
        currentSquare = boardLayout[row][column];
        try {
            if (currentSquare.isStartingSquare()) {
                return;
            }
            currentSquare.setData(data);
        } catch (NullPointerException e) {
            currentSquare = new Square(row, column);
            currentSquare.setData(data);
            int squareCageID = determine3x3Grid(row, column);
            currentSquare.setCageID(squareCageID);
            boardLayout[row][column] = currentSquare;
        }

    }

    public void removeDataFromSquare(int row, int column) {
        addDataToSquare(row, column, 0);
    }
    
    public void resetBoard() {
        boardLayout = new Square[puzzleSize][puzzleSize];
    }

    private int determine3x3Grid(int row, int column) {
        int squareCageID = 0;

        if (row >= 0 && row < 3) {
            if (column >= 0 && column < 3) {
                squareCageID = 1;
            } else if (column >= 3 && column < 6) {
                squareCageID = 2;
            } else if (column >= 6) {
                squareCageID = 3;
            }

        } else if (row >= 3 && row < 6) {
            if (column >= 0 && column < 3) {
                squareCageID = 4;
            } else if (column >= 3 && column < 6) {
                squareCageID = 5;
            } else if (column >= 6) {
                squareCageID = 6;
            }
        } else if (row >= 6) {
            if (column >= 0 && column < 3) {
                squareCageID = 7;
            } else if (column >= 3 && column < 6) {
                squareCageID = 8;
            } else if (column >= 6) {
                squareCageID = 9;
            }
        }

        return squareCageID;
    }

    public boolean isLegal(int row, int column) {
        Square squareToCheck = boardLayout[row][column];

        if (checkRowDuplicates(squareToCheck)) {
            return false;
        } else if (checkColumnDuplicates(squareToCheck)) {
            return false;
        } else if (squareToCheck.isStartingSquare()) {
            return true;
        } else if (checkBoxDuplicates(squareToCheck)) {
            return false;
        }
        return true;
    }
    
    public boolean isLegalStart(int row, int column) {
        Square squareToCheck = boardLayout[row][column];

        if (checkRowDuplicates(squareToCheck)) {
            return false;
        } else if (checkColumnDuplicates(squareToCheck)) {
            return false;
        }else if (checkBoxDuplicates(squareToCheck)) {
            return false;
        }
        return true;
    }

    private boolean checkBoxDuplicates(Square checkSquare) {
        int squareData = checkSquare.getData();
        int squaresCageID = checkSquare.getCageID();
        Box squaresCage = (Box) boxes.getEntry(squaresCageID);
        int cageRowStart = squaresCage.getRowStart();
        int cageColumnStart = squaresCage.getColumnStart();

        for (int i = cageRowStart; i < squaresCage.getRowStart() + 3; i++) {
            for (int j = cageColumnStart; j < squaresCage.getColumnStart() + 3; j++) {
                Square currentSquare = boardLayout[i][j];

                //Check if data in square is the same
                if (currentSquare != null && !currentSquare.equals(checkSquare)) {
                    if (squareData == currentSquare.getData()) {
                        //Found duplicate
                        return true;
                    }
                }

            }
        }
        //No duplicate was found
        return false;
    }

    private boolean checkColumnDuplicates(Square checkSquare) {
        int rowPos = checkSquare.getRow();
        int columnPos = checkSquare.getColumn();
        int checkSquareData = checkSquare.getData();

        for (int i = rowPos + 1; i < puzzleSize; i++) {
            //Get the data from the next square in the row
            Square nextSquare = boardLayout[i][columnPos];

            if (nextSquare != null) {
                int nextSquareData = nextSquare.getData();
                //Returns true if a duplicate is found
                if (checkSquareData == nextSquareData) {
                    return true;
                }
            }

        }

        for (int j = rowPos - 1; j >= 0; j--) {
            //Get the data from the previous square in the row
            Square previousSquare = boardLayout[j][columnPos];

            if (previousSquare != null) {
                int previousSquareData = previousSquare.getData();
                //Returns true if a duplicate is found
                if (checkSquareData == previousSquareData) {
                    return true;
                }
            }
        }
        //No duplicates in the row
        return false;

    }

    private boolean checkRowDuplicates(Square checkSquare) {
        int rowPos = checkSquare.getRow();
        int columnPos = checkSquare.getColumn();
        int checkSquareData = checkSquare.getData();

        for (int i = columnPos + 1; i < puzzleSize; i++) {
            //Get the data from the next square in the row
            Square nextSquare = boardLayout[rowPos][i];

            if (nextSquare != null) {
                int nextSquareData = nextSquare.getData();
                //Returns true if a duplicate is found
                if (checkSquareData == nextSquareData) {
                    return true;
                }
            }
        }

        for (int j = columnPos - 1; j >= 0; j--) {
            //Get the data from the previous square in the row
            Square previousSquare = boardLayout[rowPos][j];

            if (previousSquare != null) {
                int previousSquareData = previousSquare.getData();
                //Returns true if a duplicate is found
                if (checkSquareData == previousSquareData) {
                    return true;
                }
            }
        }
        //No duplicates in the column
        return false;
    }

    public int[][] toIntArray() {
        int[][] results = new int[puzzleSize][puzzleSize];

        for (int i = 0; i < puzzleSize; i++) {
            for (int j = 0; j < puzzleSize; j++) {
                int squareData = boardLayout[i][j].getData();
                results[i][j] = squareData;
            }
        }
        return results;
    }

    public int getPuzzleSize() {
        return puzzleSize;
    }

}
