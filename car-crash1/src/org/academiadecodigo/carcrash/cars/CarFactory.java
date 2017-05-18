package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static Car getNewCar() {
        int number = (int) (Math.random() * 2);

        if (number == 0) {
            Car car1 = new Fiat(new Position(3));
            return car1;
        } else {
            Car car1 = new Mustang(new Position(1),CarType.MUSTANG);
            return car1;
        }
    }
}