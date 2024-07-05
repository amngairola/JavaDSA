package Recursion.Hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LINK - https://leetcode.com/problems/n-queens/

public class N_queens {
    List<List<String>> queens = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {

        // create a 2d array for board and mark as empty
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();

        dfs(0, board, res);
        return res;

    }

    static void dfs(int col, char[][] board, List<List<String>> res) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    static boolean validate(char[][] board, int r, int c) {
        int temprow = r;
        int tempcol = c;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }

        r = temprow;
        c = tempcol;

        while (c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            c--;
        }

        r = temprow;
        c = tempcol;

        while (c >= 0 && r < board.length) {
            if (board[r][c] == 'Q')
                return false;
            c--;
            r++;
        }

        return true;
    }

    static List<String> construct(char[][] board) {
        // this line creates a new LinkedList to store strings. The variable res will
        // hold the list of strings that we will construct from the board.
        List<String> res = new LinkedList<String>();

        for (int i = 0; i < board.length; i++) {

            // Inside the loop, this line converts the current row (which is a char[]) into
            // a String. board[i] gives the i-th row of the board.
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    // way - 2

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];

        solve(0, board, res, leftRow, upperDiagonal, lowerDiagonal);

        return res;
    }

    static void solve(int col, List<List<String>> res, char[][] board, int[] leftRow, int[] upperDiagonal,
            int[] lowerDiagonal) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;

                solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }
}
