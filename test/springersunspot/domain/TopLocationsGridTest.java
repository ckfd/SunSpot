package net.room32.springersunspot.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;


public class TopLocationsGridTest {


    @Test
    public void testGetTopLocations() throws Exception {

        //Given
        int[] gridData = {
                2, 3, 2, 1,
                4, 4, 2, 0,
                3, 4, 1, 1,
                2, 3, 4, 4};

        Grid grid = new Grid(4, gridData);

        //When
        int numberOfResultsRequested = 3;
        List<Location> actualLocations = grid.getTopLocations(numberOfResultsRequested);

        //Then
        List<Location> expectedLocations = new ArrayList<Location>(numberOfResultsRequested);

        expectedLocations.add(new Location(2, 1, 27));
        expectedLocations.add(new Location(1, 1, 25));
        expectedLocations.add(new Location(2, 2, 23));

        assertThat(actualLocations, equalTo(expectedLocations));

    }
}
