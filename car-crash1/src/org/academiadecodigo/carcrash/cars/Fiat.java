package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

/**
 * Created by codecadet on 17/05/17.
 */
public class Fiat extends Car {
    public Fiat(Position position) {
        super(position, CarType.FIAT);
    }

    @Override

    public String toString() {
        return "F";
    }
}
