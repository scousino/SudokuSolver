

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Spencer Cousino
 */
public class Square {

    private int cageID;
    private int data;
    private int row;
    private int column;
    private boolean startingSquare;

    public boolean isStartingSquare() {
        return startingSquare;
    }

    public void setStartingSquare(boolean startingSquare) {
        this.startingSquare = startingSquare;
    }

    public Square(int row, int column) {
        data = 0;
        this.row = row;
        this.column = column;
    }

    public void setCageID(int cageID) {
        this.cageID = cageID;
    }

    public int getCageID() {
        return cageID;
    }

    public int getData() {
        return data;
    }

    public void setData(int dataVal) {
        data = dataVal;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
