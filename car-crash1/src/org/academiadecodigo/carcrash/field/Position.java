package org.academiadecodigo.carcrash.field;

public class Position {

    private int col;
    private int row;
    private int slow;
    private int lastMove;
    private int numb;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Position(int speed) {
        col = (int) (Math.random() * ((Field.getWidth()) + 1));
        row = (int) (Math.random() * ((Field.getHeight()) + 1));
        this.slow = speed;
    }

    public void move() {

        if(((int) (Math.random() * 101) < 85)) {
            numb = lastMove;
        }
        else {
            int numb1 = (int) (Math.random() * 4);
            while((int) (Math.random() * 4)==lastMove) {
                numb1 = (int) (Math.random() * 4);
            }
            numb = numb1;

        }

        switch (numb) {
            case 0:

                moveRight();
                lastMove = 0;

                break;
            case 1:

                moveUp();
                lastMove = 1;
                break;
            case 2:

                moveDown();
                lastMove = 2;

                break;
            case 3:

                moveLeft();
                lastMove = 3;

                break;
        }
    }

    public void moveRight() {

        if (col < Field.getWidth()) {
            col++;
        } else {
            col = 0;
        }
    }

    public void moveLeft() {

        if (col > 0) {
            col--;
        } else {
            col = Field.getWidth();
        }
    }

    public void moveDown() {

        if (row > Field.getHeight()) {
            row = 0;
        }
        else {
            row++;
        }
    }

    public void moveUp() {

        if (row < 0) {
            row = Field.getHeight();
        }
        else {
            row--;
        }
    }

    public int getSlow() {
        return slow;
    }
}