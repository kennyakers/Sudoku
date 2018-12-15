
public class Board {

    private int[][] board;

    public Board(int[][] inputBoard) {
        this.board = inputBoard;
    }

    public boolean isLegal(int row, int column, int value) {
        // Check rows and columns
        for (int i = 0; i < this.board[0].length; i++) {
            if (this.board[row][i] == value || this.board[i][column] == value) {
                return false;
            }
        }

        // Check squares
        int boxDimension = (int) Math.sqrt(this.board.length);
        int boxRow = row - (row % boxDimension); // Starting row index for the box containing this (row, column).
        int boxColumn = column - (column % boxDimension); // Starting column index for the box containing this (row, column).
        for (int i = boxRow; i < boxRow + boxDimension; i++) {
            for (int j = boxColumn; j < boxColumn + boxDimension; j++) {
                if (this.board[i][j] == value) {
                    return false;
                }
            }
        }
        // Make sure it's blank
        return this.board[row][column] == 0;
    }

    public boolean solve() {
        int blankRow = -1;
        int blankColumn = -1;
        boolean solved = true;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                if (this.board[i][j] == 0) {
                    blankRow = i;
                    blankColumn = j;
                    solved = false;
                    break;
                }
            }
            if (!solved) {
                break;
            }
        }

        if (solved) {
            // We're done, so return true
            return true;
        }

        // else for each-row backtrack 
        for (int value = 1; value <= this.board.length; value++) {
            if (this.isLegal(blankRow, blankColumn, value)) {
                board[blankRow][blankColumn] = value;
                if (this.solve()) {
                    return true;
                } else {
                    board[blankRow][blankColumn] = 0; // Value didn't work, so erase it.
                }
            }
        }
        return false;
    }

    public void print() {
        int rowLength = 0;
        for (int row = 0; row < this.board.length; row++) {
            for (int column = 0; column < this.board.length; column++) {
                if (column != 0 && column % (int) Math.sqrt(this.board.length) == 0) {
                    System.out.print("| ");
                    rowLength += 2;
                }
                System.out.print(this.board[row][column] + " ");
                rowLength += 2;
            }
            System.out.println("");

            if ((row + 1) % (int) Math.sqrt(board.length) == 0 && row != this.board.length - 1) {
                for (int i = 0; i < rowLength; i++) {
                    System.out.print("-");
                }
                System.out.println("");
            }
            rowLength = 0;
        }
    }

}
