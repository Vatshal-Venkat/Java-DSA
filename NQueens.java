public class NQueens {
    public static void main(String[] args) {
        int n = 8; // Change this value for different board sizes
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Start solving the problem
        if (solve(board, 0, n)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists for " + n + " queens.");
        }
    }

    // Backtracking function to place queens
    public static boolean solve(char[][] board, int row, int n) {
        // Base case: All queens are placed
        if (row == n) {
            return true;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 'Q';

                // Recur to place queens in the next row
                if (solve(board, row + 1, n)) {
                    return true;
                }

                // Backtrack: Remove the queen
                board[row][col] = '.';
            }
        }

        // If no column is valid, return false
        return false;
    }

    // Function to check if it's safe to place a queen
    public static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check the same column upwards
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Function to print the chessboard
    // Function to print the chessboard using an enhanced for loop
public static void printBoard(char[][] board) {
    for (char[] row : board) {
        for (char cell : row) {
            System.out.print(cell + " ");
        }
        System.out.println();
    }
}

}

