package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.cars.CarType;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 20;

    public int round;

    /**
     * Graphical Car Field
     */
    private Field field;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }

    public void moveAllCars() {

        round++;
        for (int i = 0; i < cars.length; i++) {
            if (round % cars[i].getPos().getSlow() == 0) {
            if (!cars[i].isCrashed()) {
                    cars[i].move();
                    for (int k = 0; k < cars.length; k++) {
                        if (i == k) {
                            continue;
                        } else {
                            if (cars[i].getPos().getRow() == cars[k].getPos().getRow() &&
                                    cars[i].getPos().getCol() == cars[k].getPos().getCol()) {
                                cars[i].setCrash();
                                cars[k].setCrash();
                            }
                        }
                    }
                }
            }
        }
    }
}
