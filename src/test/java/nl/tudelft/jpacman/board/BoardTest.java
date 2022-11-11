package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Testing board class.
 *
 * @author Tasha Settewong 
 */
public class BoardTest {
     /**
     * Do the invarant method perform correctly?.
     */
    @Test
    void testInvariant() {
        Square row = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = row;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }
    
     /**
     * Do the squareAt method perform correctly?.
     */
    @Test
    void testSquareAt() {
        Square row = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = row;
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }
}
