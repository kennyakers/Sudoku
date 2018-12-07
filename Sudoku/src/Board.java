
public class Board {

    private int[][] board;

    public Board(int[][] inputBoard) {
        this.board = inputBoard;
    }

    public boolean isGoalState() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                if (!this.isLegal(i, j, this.board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean move(int x, int y, int number) {
        boolean legal = this.isLegal(x, y, number);
        if (legal) {
            this.board[x][y] = number;
        }
        return legal;
    }

    public boolean isLegal(int x, int y, int number) {

        boolean[] rowValues = new boolean[9];
        boolean[] columnValues = new boolean[9];

        for (int i = 0; i < board.length; i++) {
            columnValues[this.board[x][i]] = true;
            rowValues[this.board[i][y]] = true;
        }
        for (int i = 0; i < rowValues.length; i++) {
            if (!columnValues[i] && rowValues[i]) {
                return false;
            }
        }
        return true;
    }
}
