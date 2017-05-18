package org.academiadecodigo.bootcamp.sniperelite;

import org.academiadecodigo.bootcamp.sniperelite.gameObjets.Enemy;

/**
 * Created by codecadet on 18/05/17.
 */
public class SniperRiffle {

    private int bulletDamage = 20;

    public void shoot(Enemy enemy) {
        int number;

        number = (int) (Math.random() * 101);
        if(number < 75) {
            System.out.println(enemy);
            System.out.println("You shot the bastard!!!");
            enemy.hit(bulletDamage);
        }
        else {
            System.out.println("Sorry, bro! Better luck next time!");
        }
    }

    public int getBulletDamage() {
        return bulletDamage;
    }
}
