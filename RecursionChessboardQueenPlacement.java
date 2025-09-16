import java.util.*;

public class RecursionChessboardQueenPlacement {

    public boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // vertical
        for (int k = 0; k < board[0].length; k++) {
            if (board[k][col] == 'Q')
                return false;
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (board[r][c] == 'Q')
                return false;
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) { // ERROR FIXED <<<
            if (board[r][c] == 'Q')
                return false;
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) { // ERROR FIXED <<<
            if (board[r][c] == 'Q')
                return false;
        }

        // lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) { // ERROR FIXED <<<
            if (board[r][c] == 'Q')
                return false;
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // ERROR FIXED <<< board initialization
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // Optional main method to test
    public static void main(String[] args) {
        RecursionChessboardQueenPlacement solver = new RecursionChessboardQueenPlacement();
        int n = 4; // Change this value to test for different board sizes
        List<List<String>> solutions = solver.solveNQueens(n);

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println("    ");
        }
    }
}