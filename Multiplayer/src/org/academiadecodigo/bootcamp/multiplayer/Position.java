package org.academiadecodigo.bootcamp.multiplayer;

import javafx.geometry.Pos;

/**
 * Created by codecadet on 20/06/17.
 */
public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int rowToY() {
        return row * Grid.CELLSIZE;
    }

    public int colToX() {
        return col * Grid.CELLSIZE;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
