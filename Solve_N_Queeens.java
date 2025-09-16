
import java.util.*;
public class Solve_N_Queeens {
    public static boolean isSafe(int row, int col,char[][] board) {
        // Horizontal check
        for(int j=0; j<board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // Vertical check
        for(int i=0; i<board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Upper left diagonal check
        
        for(int c = col, r = row; c>=0 && r>=0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        //Upper right diagonal check
       
        for(int c = col, r = row; c<board.length && r>=0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Lower left diagonal check
        
        for(int c = col, r = row; c>=0 && r<board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // Lower right diagonal check
        
        for(int c = col, r = row; c<board.length && r<board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        
    
        return true;
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j=0; j<board[0].length; j++) {
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
    public static void helper(char [][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            // saving the placement of the board 
            saveBoard(board, allBoards);
            return;
        }
        for(int row = 0; row<board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }

}
    public List<List<String>> SolveNQueeens(int n) {
    List<List<String>> allBoards = new ArrayList<>();
    char [][] board = new char[n][n];
    helper(board, allBoards, 0);
    return allBoards;
    }
}

