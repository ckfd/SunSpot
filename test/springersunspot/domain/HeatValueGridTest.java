package net.room32.springersunspot.domain;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class HeatValueGridTest {

    private static Grid grid;
    private static int bottomRow;
    private static int topRow = 0;
    private static int leftMostColumn = 0;
    private static int rightMostColumn;


    @BeforeClass
    public static void createGrid() {
        int gridSize = 5;

        int[] gridData = {
                5, 3, 1, 2, 0,
                4, 1, 1, 3, 2,
                2, 3, 2, 4, 3,
                0, 2, 3, 3, 2,
                1, 0, 2, 4, 3};

        grid = new Grid(gridSize, gridData);

        bottomRow = gridSize - 1;
        rightMostColumn = gridSize - 1;

    }

    @Test
    public void shouldFindHeatValueForTopRightCorner() throws Exception {
        // When
        int expectedHeatValue = 0;
        int actualHeatValue = grid.getHeatValueFor(topRow, rightMostColumn);

        // Then
        assertEquals(expectedHeatValue, actualHeatValue);

    }

    @Test
    public void shouldFindHeatValueForTopLeftCorner() throws Exception {
        // When
        int expectedHeatValue = 5;
        int actualHeatValue = grid.getHeatValueFor(topRow, leftMostColumn);

        // Then
        assertEquals(expectedHeatValue, actualHeatValue);
    }

    @Test
    public void shouldFindHeatValueForBottomLeftCorner() throws Exception {
        // When
        int expectedHeatValue = 1;
        int actualHeatValue = grid.getHeatValueFor(bottomRow, leftMostColumn);

        // Then
        assertEquals(expectedHeatValue, actualHeatValue);
    }

    @Test
    public void shouldFindHeatValueForBottomRightCorner() throws Exception {
        // When
        int expectedHeatValue = 3;
        int actualHeatValue = grid.getHeatValueFor(bottomRow, rightMostColumn);

        // Then
        assertEquals(expectedHeatValue, actualHeatValue);
    }


}
