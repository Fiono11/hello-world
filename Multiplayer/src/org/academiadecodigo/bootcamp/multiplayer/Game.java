package org.academiadecodigo.bootcamp.multiplayer;

/**
 * Created by codecadet on 20/06/17.
 */
public class Game implements Runnable {

    private Cat cat;
    private Mouse mouse;
    private Grid grid;

    public Game() {
        grid = new Grid(24,24);
        cat = new Cat();
        mouse = new Mouse();
        try {
            start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() throws InterruptedException{
        while (true) {
            Thread.sleep(500);
            cat.move();
            mouse.move();
        }
    }

    @Override
    public void run() {
        try {
            start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
