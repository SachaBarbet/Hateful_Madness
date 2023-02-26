package com.github.hatefulmadness;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        // We load the screen
        JFrame frame = new JFrame("Hateful Madness");
        GameWindow window = new GameWindow(frame);
        window.initWindow();
    }
}