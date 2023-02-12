package src.Recursion;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class queenCombination {


    public static void Queen_comb2D_wrt_Box(boolean[][] board, int row, int col, int placed_Q, int total_Q,
                                            String ans) {
        if (total_Q == placed_Q) { // +ve
            System.out.println(ans);
            return;
        }
        if (col == board[row].length) {
            row = row + 1;
            col = 0;
        }
        if (row == board.length) { // -ve
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Queen_comb2D_wrt_Box(board, row, col + 1, placed_Q + 1, total_Q, ans + "{" + row + "," + col + "}"); // Select																							// box
            board[row][col] = false;
        }

        Queen_comb2D_wrt_Box(board, row, col + 1, placed_Q, total_Q, ans); // dont place just go next GG
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Check above

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check left
        for (int j = 0; j < col; j++) {
            if (board[row][j]) {
                return false;
            }
        }
        // Upper left Diagonal
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {

            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Upper right Diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
