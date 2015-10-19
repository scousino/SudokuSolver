/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Spencer Cousino
 */
public class Box {

    private int rowStart;
    private int columnStart;

    public Box(int row, int column) {
        rowStart = row;
        columnStart = column;

    }

    public int getRowStart() {
        return rowStart;
    }

    public int getColumnStart() {
        return columnStart;
    }

}
