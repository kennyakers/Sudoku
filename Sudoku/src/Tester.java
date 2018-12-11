/**
 * Kenny Akers
 * Mr. Paige
 * Homework #
 *
 */
public class Tester {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };
        Board board = new Board(array);
        board.solve(0, 0, 1, board).print();
    }

}
