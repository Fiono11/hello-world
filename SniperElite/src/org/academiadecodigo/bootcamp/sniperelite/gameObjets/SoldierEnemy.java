package org.academiadecodigo.bootcamp.sniperelite.gameObjets;

import org.academiadecodigo.bootcamp.sniperelite.SniperRiffle;

/**
 * Created by codecadet on 18/05/17.
 */
public class SoldierEnemy extends Enemy {

    @Override
    public void hit(int bulletDamage) {
        System.out.println(getHealth());
        setHealth(getHealth() - bulletDamage);
        System.out.println(getHealth());
        if(getHealth() < 0) {
            setDead(true);
        }
    }

    public SoldierEnemy (int health) {
        super(health);
    }

    @Override
    public String toString() {
        return "SoldierEnemy";
    }
}
