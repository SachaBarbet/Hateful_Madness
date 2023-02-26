package com.github.hatefulmadness;

import javax.swing.*;

public class GameWindow {

    public static int WIDTH;
    public static int HEIGHT;
    private final JFrame frame;

    public GameWindow(JFrame frame) {
        this.frame = frame;
    }

    public void initWindow() {
        // create the window
        // We stop the program when we close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // we can't resize the window
        frame.setResizable(false);
        // we place de window at the center of our screen
        frame.setLocationRelativeTo(null);
        // fullscreen borderless window (alt f4 to close)
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        WIDTH = frame.getWidth();
        HEIGHT = frame.getHeight();
        // we print the window
        frame.setVisible(true);
    }
}
