
public class Board {

    private int[][] board;

    private boolean debug = true;

    public Board(int[][] inputBoard) {
        this.board = inputBoard;
    }

    public boolean isGoalState() {
        int sumRow = 0;
        int sumColumn = 0;
        int desiredSum = 0;
        for (int i = this.board.length; i > 0; i--) {
            desiredSum += i;
        }
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                if (this.board[x][y] == 0 || this.board[y][x] == 0) {
                    return false;
                }
                sumRow += this.board[x][y];
                sumColumn += this.board[y][x];
            }
            if (!(sumRow == desiredSum && sumColumn == desiredSum)) {
                return false;
            }
            sumRow = 0;
            sumColumn = 0;
        }
        return true;
    }

    public boolean isLegal(int x, int y, int number) {
        for (int i = 0; i < this.board[0].length; i++) {
            if (this.board[x][i] == number || this.board[i][y] == number) {
                return false;
            }
        }
        return this.board[x][y] == 0;
    }

    public boolean move(int x, int y, int number) {
        if (this.isLegal(x, y, number)) {
            this.board[x][y] = number;
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("");
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean solve(int x, int y, int value) {
        if (this.isGoalState()) {
            return true;
        }

        

        //if goalState return true
        //do the modular arithmetic for next move (rows = / , columns = %)
        //attempt the requested move
        //if it works
            //for all possible values attempt to solve for next move
            //at the end of the for loop if we never got a true back
                //set that coordinate to zero
                //return false
            //if we got a true back
                //return true!
        //if fails
            //return false
        for (int i = 1; i <= board.length; i++) {
            boolean result = solve(x, y, i);
        }
        
    }

}
