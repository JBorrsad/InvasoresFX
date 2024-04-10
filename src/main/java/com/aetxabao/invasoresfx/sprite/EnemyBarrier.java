package com.aetxabao.invasoresfx.sprite;

import javafx.scene.image.Image;

import javafx.scene.canvas.GraphicsContext;

import static com.aetxabao.invasoresfx.game.AppInvasoresFx.gameRect;



public class EnemyBarrier extends AEnemy implements IHaveShield {

    private EnemyShip targetShip;

    public EnemyBarrier(Image img, int rows, int cols, EnemyShip target) {
        super(img, rows, cols);
        this.targetShip = target;
    }

    @Override
    public void update() {

        if (targetShip != null) {

            setX(targetShip.getX() + (targetShip.getWidth() - getWidth()) / 2);
            setY(targetShip.getY() - getHeight());
        }
    }

    public boolean impact() {
        return true;
    }

}