package com.tetrisdojo;

import javax.swing.*;

public class TetrisFrame {
    public void frame(){
        final int width = 300;
        final int height = 600;
        JFrame jFrame = new JFrame("Frame");
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
    }
}
