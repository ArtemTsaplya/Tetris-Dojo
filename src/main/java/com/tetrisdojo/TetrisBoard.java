package com.tetrisdojo;

public class TetrisBoard {
    private int strings = 19;
    private int columns = 9;
    int[][] arrayBoard = new int [strings] [columns];
    public void board(){
        int value = 1;
        for (int i = 0; i < strings ; i++) {
            for (int j = 0; j < columns; j++) {
                arrayBoard[i][j] = value;
                value++;
            }
        }
    }
}
