package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

import javax.swing.*;

/**
 * Created by codecadet on 17/05/17.
 */
public class Mustang extends Car {
    public Mustang(Position p, CarType carType) {
        super(p,carType);
    }

    @Override

    public String toString() {
        String s = "M";
        return s;
    }
}
