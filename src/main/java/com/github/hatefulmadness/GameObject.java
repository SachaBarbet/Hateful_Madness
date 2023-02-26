package com.github.hatefulmadness;

import java.awt.*;

public class GameObject {
    public int xPos, yPos;

    public GameObject(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void moveTo(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Rectangle getBounds(int xPos, int yPos) {
        return new Rectangle(xPos, yPos, 64, 64);
    }
}
