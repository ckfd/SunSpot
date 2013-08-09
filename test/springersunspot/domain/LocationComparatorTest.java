package net.room32.springersunspot.domain;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class LocationComparatorTest {
    Location aHighScore = new Location(1, 1, 30);
    Location aLowScore = new Location(1, 2, 5);
    Location anotherHighScore = new Location(1, 3, 30);

    @Test
    public void shouldBeGreaterThan() {
        // When
        int compared = aHighScore.compareTo(aLowScore);
        // Then
        assertThat(compared, is(greaterThan(0)));
    }

    @Test
    public void shouldBeLessThan() {
        // When
        int compared = aLowScore.compareTo(aHighScore);
        // Then  negative
        assertThat(compared, is(lessThan(0)));
    }

    @Test
    public void shouldBeEqual() {
        // When
        int compared = aHighScore.compareTo(anotherHighScore);
        // Then
        assertThat(compared, is(equalTo(0)));
    }
}
