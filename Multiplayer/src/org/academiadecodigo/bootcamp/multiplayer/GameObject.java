package org.academiadecodigo.bootcamp.multiplayer;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 20/06/17.
 */
public abstract class GameObject {

    private Rectangle rectangle;
    private Position position;
    private Direction direction;

    public GameObject() {
        position = new Position((int) (Math.random() * 23), (int) (Math.random() * 23));
        direction = Direction.values()[(int) (Math.random() * 3)];
        rectangle = new Rectangle(position.colToX(), position.rowToY(), Grid.CELLSIZE, Grid.CELLSIZE);
        rectangle.fill();
    }

    public void move() {
        switch (direction) {
            case RIGHT:
                moveRight();
                break;
            case LEFT:
                moveLeft();
                break;
            case DOWN:
                moveDown();
                break;
            case UP:
                moveUp();
                break;
        }
    }

    public void moveRight() {
        if (position.getCol() == 23) {
            position.setCol(0);
            rectangle.translate(-Grid.CELLSIZE * 23, 0);
            return;
        }
        System.out.println(position.getCol());
        position.setCol(position.getCol() + 1);
        rectangle.translate(Grid.CELLSIZE, 0);
    }

    public void moveLeft() {
        if (position.getCol() == 0) {
            position.setCol(23);
            rectangle.translate(Grid.CELLSIZE * 23, 0);
            return;
        }
        position.setCol(position.getCol()-1);
        rectangle.translate(-Grid.CELLSIZE, 0);
    }

    public void moveDown() {
        if (position.getRow() == 23) {
            position.setRow(0);
            rectangle.translate(0, -Grid.CELLSIZE * 23);
            return;
        }
        position.setRow(position.getRow()+1);
        rectangle.translate(0, Grid.CELLSIZE);
    }

    public void moveUp() {
        if (position.getRow() == 0) {
            position.setRow(23);
            rectangle.translate(0, Grid.CELLSIZE * 23);
            return;
        }
        position.setRow(position.getRow()-1);
        rectangle.translate(0, -Grid.CELLSIZE);
    }

    public abstract void paintRectangle();

    public Rectangle getRectangle() {
        return rectangle;
    }
}
