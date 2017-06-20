package org.academiadecodigo.bootcamp.multiplayer;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 20/06/17.
 */
public class Mouse extends GameObject {

    public Mouse() {
        super();
        paintRectangle();
    }

    @Override
    public void paintRectangle() {
        getRectangle().setColor(Color.BLUE);
    }
}
