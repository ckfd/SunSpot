package net.room32.springersunspot.domain;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolarActivityScoreGridTest {

    private static Grid grid;

    @BeforeClass
    public static void createGrid() {
        int[] gridData = {
                5, 3, 1, 2, 0,
                4, 1, 1, 3, 2,
                2, 3, 2, 4, 3,
                0, 2, 3, 3, 2,
                1, 0, 2, 4, 3};

        int gridSize = 5;
        grid = new Grid(gridSize, gridData);
    }

    @Test
    public void shouldFindScoreForTopLeftCorner() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(0, 0);

        // Then
        int expectedScore = 5 + 3 + 4 + 1;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForTopRightCorner() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(0, 4);

        // Then
        int expectedScore = 0 + 2 + 3 + 2;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForBottomLeftCorner() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(4, 0);

        // Then
        int expectedScore = 0 + 2 + 1 + 0;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForBottomRightCorner() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(4, 4);

        // Then
        int expectedScore = 3 + 2 + 4 + 3;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForCenter() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(2, 2);

        // Then
        int expectedScore = 1 + 1 + 3 + 3 + 2 + 4 + 2 + 3 + 3;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForTopEdge() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(0, 2);

        // Then
        int expectedScore = 3 + 1 + 2 + 1 + 1 + 3;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForBottomEdge() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(4, 2);

        // Then
        int expectedScore = 2 + 3 + 3 + 0 + 2 + 4;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForRightEdge() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(2, 4);

        // Then
        int expectedScore = 3 + 2 + 4 + 3 + 3 + 2;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void shouldFindScoreForLeftEdge() {
        // When
        int actualScore = grid.getSolarActivityScoreFor(2, 0);

        // Then
        int expectedScore = 4 + 1 + 2 + 3 + 0 + 2;
        assertEquals(expectedScore, actualScore);
    }

}
