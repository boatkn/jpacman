package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test
    void TestBasicSquare(){
        Square[][] grid = {{new BasicSquare()}};
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    @Test
    void TestsquareAt(){
        Square[][] grid = {{null}};
        Board board = new Board(grid);
        assertThat(board.squareAt(0,1)).isEqualTo(0);
    }
}
