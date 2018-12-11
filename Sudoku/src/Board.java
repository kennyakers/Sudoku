
import java.util.Arrays;

public class Board {

    private int[][] board;

    public Board(int[][] inputBoard) {
        this.board = inputBoard;
    }

    public boolean isGoalState() {
        int sum = 0; 
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board.length; y++){
                
            }
        }
        return true;
    }
    
    public boolean isLegal(int x, int y, int number) {

        boolean[] rowValues = new boolean[9];
        boolean[] columnValues = new boolean[9];

        for (int i = 0; i < board.length; i++) {
            columnValues[this.board[x][i]] = true;
            rowValues[this.board[i][y]] = true;
        }
        for (int i = 0; i < rowValues.length; i++) {
            if (!(columnValues[i] && rowValues[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean move(int x, int y, int number) {
        for(int i = 0; i < board.length; i++){
            if(board[x][i] == number || board[i][y] == number)
                return false;
        }
        if(board[x][y] == 0){
            board[x][y] = number;
            return true;
        }
        return false;
    }

    

    private Board copy() {
//        int[][] array = new int[board.length][board.length];
//        for (int i = 0; i < this.board.length; i++ ) {
//            for (int j = 0; j < this.board[0].length; j++) {
//                array[i][j] = this.board[i][j];
//            }
//        }
//        return new Board(array);
        return new Board(this.board);
    }
    
    public void print() {
        for (int i = 0; i < this.board.length; i++ ) {
            for (int j = 0; j < this.board[0].length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public Board solve(int x, int y, int value, Board inputBoard) {
        Board copy = inputBoard.copy();
        if (copy.isGoalState()) {
            return copy;
        }
        boolean result = copy.move(x, y, value);
        if(board[x][y] == value){
            result = true;
        }
        
        System.out.println("Move: " + x + " " + y + " " + value + " " + result);
        copy.print();
        if (!result) {
            return copy;
        }
        for (int i = 1; i <= copy.board.length; i++) {
            //0,0
            int xNext = x + 1;
            int yNext = y;
            if (xNext == board.length) {
                xNext = 0;
                yNext = y + 1;
            }
            Board attempt = this.solve(xNext, yNext, i, copy);
            if (!Arrays.equals(attempt.board, copy.board)) {
                return attempt;
            }
        }
        return copy;
    }
}
