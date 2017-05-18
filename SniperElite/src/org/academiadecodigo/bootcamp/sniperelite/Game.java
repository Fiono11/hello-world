package org.academiadecodigo.bootcamp.sniperelite;

import org.academiadecodigo.bootcamp.sniperelite.gameObjets.*;

/**
 * Created by codecadet on 18/05/17.
 */
public class Game {

    private SniperRiffle sniperRiffle;
    private int shotsFired;
    private GameObject[] gameObjects;

    public Game() {
        gameObjects = createObjects(10);
        sniperRiffle = new SniperRiffle();
    }

    public GameObject[] createObjects(int numberOfObjects) {

        gameObjects = new GameObject[numberOfObjects];

        for (int i = 0; i < numberOfObjects; i++) {
            int random = (int) (Math.random() * 101);
            int number;

            if (random < 50) {
                number = 0;
            } else if (random > 49 && random < 75) {
                number = 1;
            } else {
                number = 2;
            }

            switch (number) {
                case 2:
                    gameObjects[i] = new Tree();
                    break;
                case 1:
                    gameObjects[i] = new ArmouredEnemy(100, 50);
                    break;
                case 0:
                    gameObjects[i] = new SoldierEnemy(100);
                    break;

            }
        }

        for (GameObject g : gameObjects) {
            System.out.println(g);
        }
        return gameObjects;
    }

    public void start() {
        for (int i = 0; i < gameObjects.length; i++) {
            if (gameObjects[i] instanceof Enemy) {
                Enemy enemy = (Enemy) gameObjects[i];
                if(enemy instanceof SoldierEnemy) {
                    while (!enemy.isDead()) {
                        sniperRiffle.shoot(enemy);
                    }
                }
                }
            }
        }
    }
