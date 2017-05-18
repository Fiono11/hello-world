package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
    private CarType carType;
    private boolean crash = false;

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crash;
    }

    public Car(Position pos, CarType carType) {
        this.pos = pos;
        this.carType = carType;
    }

    public void move() {
        pos.move();
    }

    public void setCrash() {
        this.crash = true;
    }

    public CarType getCarType() {
        return carType;
    }

}
