package com.github.hatefulmadness;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;

public class Player extends GameObject implements Entity {

    private BufferedImage player;
    private double velocityX;
    private double velocityY;

    public Player(int xPos, int yPos) {
        super(xPos, yPos);

        // Load image
        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            loader.loadImage("/player.png");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Manage the player pos with his velocity (move speed), take the screen border in count
    @Override
    public void tick() {
        xPos += velocityX;
        yPos += velocityY;

        if(xPos <= 0) xPos = 0;
        if(xPos >= GameWindow.WIDTH-64) xPos = GameWindow.WIDTH - 64;
        if(yPos <= 0) yPos = 0;
        if(yPos >= GameWindow.HEIGHT-64) yPos = GameWindow.HEIGHT - 64;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(player, xPos, yPos, null);
    }

    @Override
    public Rectangle getBounds(int xPos, int yPos) {
        return new Rectangle((int)xPos, (int)yPos, 64, 64);
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }
}
