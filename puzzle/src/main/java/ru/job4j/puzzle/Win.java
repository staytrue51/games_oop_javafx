package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int cell = 0; cell < board.length; cell++) {
            if (Horizontal(board, cell) || Vertical(board, cell)) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static boolean Horizontal(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean Vertical(int[][] board, int column) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
