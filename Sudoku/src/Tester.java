
/**
 * Kenny Akers
 * Mr. Paige
 * Homework #
 *
 */
public class Tester {

    public static void main(String[] args) {

        int[][] array = {
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

        Board board = new Board(array);

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
