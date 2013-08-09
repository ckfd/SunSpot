package net.room32.springersunspot;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class SunSpotAnalyserTest {
    @Test
    public void acceptanceTest1() {
        // Given
        SunSpotAnalyser analyser = new SunSpotAnalyser();
        String input = "1 5 5 3 1 2 0 4 1 1 3 2 2 3 2 4 3 0 2 3 3 2 1 0 2 4 3";

        // When
        String actualOutput = analyser.analyse(input);

        // Then
        String expectedOutput = "(3,3 score:26)";
        assertThat(actualOutput, is(equalTo(expectedOutput)));

    }

    @Test
    public void acceptanceTest2() {
        // Given
        SunSpotAnalyser analyser = new SunSpotAnalyser();
        String input = "3 4 2 3 2 1 4 4 2 0 3 4 1 1 2 3 4 4";

        // When
        String actualOutput = analyser.analyse(input);

        // Then
        String expectedOutput = "(1,2 score:27)(1,1 score:25)(2,2 score:23)";
        assertThat(actualOutput, is(equalTo(expectedOutput)));

    }
}
