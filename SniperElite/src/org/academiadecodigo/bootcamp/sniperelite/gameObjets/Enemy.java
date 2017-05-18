package org.academiadecodigo.bootcamp.sniperelite.gameObjets;

/**
 * Created by codecadet on 18/05/17.
 */
public abstract class Enemy extends GameObject {

    private int health;
    private boolean isDead;

    public boolean isDead() {
        return isDead;
    }

    public abstract void hit(int health);

    @Override
    public String getMessage() {
        return "Olá";
    }

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }
}
