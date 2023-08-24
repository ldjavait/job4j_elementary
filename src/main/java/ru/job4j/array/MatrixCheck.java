package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int colum) {
        boolean rsl = true;
        for (char[] chars : board) {
            if (chars[colum] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
