package org.academiadecodigo.bootcamp.multiplayer;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 20/06/17.
 */
public class Grid {

    private Rectangle grid;
    private int cols;
    private int rows;
    public static final int CELLSIZE = 24;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        draw();
    }

    public void draw() {
        grid = new Rectangle(0,0, cols * CELLSIZE, rows * CELLSIZE);
        grid.draw();
    }
}
