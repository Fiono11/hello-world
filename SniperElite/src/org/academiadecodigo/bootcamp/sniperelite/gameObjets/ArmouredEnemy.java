package org.academiadecodigo.bootcamp.sniperelite.gameObjets;

/**
 * Created by codecadet on 18/05/17.
 */
public class ArmouredEnemy extends Enemy {

    private int armour = 50;

    @Override
    public void hit(int bulletDamage) {
        System.out.println(armour);
        armour =- bulletDamage;
        System.out.println(getHealth());
        setHealth(getHealth() - bulletDamage);
        System.out.println(getHealth());
        if(getHealth() < 0) {
            setDead(true);
        }
    }

    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
    }

    @Override
    public String toString() {
        return "ArmouredEnemy";
    }

    public int getArmour() {
        return armour;
    }
}
