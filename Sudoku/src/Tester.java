
/**
 * Kenny Akers
 * Mr. Paige
 * Homework #
 *
 */
public class Tester {

    public static void main(String[] args) {

        int[][] array16x16 = {
            {0, 0, 0, 0, 13, 0, 12, 0, 3, 0, 5, 0, 0, 8, 1, 10},
            {1, 0, 15, 4, 9, 0, 16, 14, 13, 12, 0, 0, 6, 0, 0, 3},
            {0, 13, 0, 5, 0, 0, 0, 10, 0, 9, 0, 2, 7, 12, 0, 0},
            {8, 0, 0, 0, 0, 15, 2, 0, 0, 1, 6, 0, 0, 0, 4, 0},
            {0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 2, 0, 0, 14},
            {0, 0, 1, 6, 0, 0, 0, 0, 15, 13, 0, 14, 0, 0, 16, 12},
            {0, 12, 0, 0, 0, 0, 0, 8, 0, 3, 0, 4, 1, 0, 7, 0},
            {0, 0, 0, 15, 0, 3, 1, 0, 16, 0, 0, 10, 0, 4, 8, 11},
            {0, 0, 0, 0, 0, 0, 8, 16, 0, 4, 0, 1, 0, 14, 0, 0},
            {0, 15, 0, 0, 0, 6, 9, 0, 10, 5, 11, 0, 0, 16, 12, 1},
            {0, 11, 9, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 2, 3, 7},
            {13, 0, 0, 0, 0, 12, 11, 0, 6, 2, 16, 7, 0, 0, 0, 0},
            {0, 10, 12, 0, 0, 13, 3, 0, 4, 0, 15, 0, 16, 0, 0, 5},
            {2, 0, 4, 0, 0, 0, 7, 1, 0, 0, 0, 6, 0, 0, 14, 13},
            {0, 0, 0, 3, 8, 9, 0, 0, 1, 16, 2, 11, 12, 10, 0, 0},
            {0, 0, 16, 1, 12, 11, 0, 0, 5, 14, 0, 0, 3, 7, 9, 0}
        };
        
        int[][] array9x9 = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

    
    
        Board board = new Board(array9x9);

        if (board.solve()) {
            board.print();
        } else {
            System.out.println("No solution");
        }

    }

    /*
    4 5 1 2 3
    5 1 2 3 4
    1 2 3 4 5
    2 3 4 5 1
    3 4 5 1 2
     */
}
