package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MatrixCheck {

    /**
     * Метод проверяет есть ли выигрышная комбинация ( 5 Х в ряд по вертикали или горизонтал )
     * @param board - двумерный массив ( поле размеро 5х5)
     * @return - true если есть выигрышная комбинация
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[0][row] == 'X'
                    && board[1][row] == 'X'
                    && board[2][row] == 'X'
                    && board[3][row] == 'X'
                    && board[4][row] == 'X') {
                result = true;
            }
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                if (board[row][0] == 'X'
                        && board[row][1] == 'X'
                        && board[row][2] == 'X'
                        && board[row][3] == 'X'
                        && board[row][4] == 'X') {
                  result = true;
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}