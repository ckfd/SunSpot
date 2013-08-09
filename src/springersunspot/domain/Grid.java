package net.room32.springersunspot.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid {
    private int sz;
    private int[] gridData;

    public Grid(int gridSize, int[] gridData) {
        sz = gridSize;
        this.gridData = gridData;
    }

    public List<Location> getTopLocations(int numberOfResultsRequested) {
       List<Location> locations = new ArrayList<Location>(sz*sz);

        for (int row = 0; row < sz; row++) {
            for (int column = 0; column < sz; column++) {
                int score = getSolarActivityScoreFor(row, column);
                locations.add(new Location(row, column, score));
            }
        }

        Collections.sort(locations, Collections.reverseOrder());
        return locations.subList(0, numberOfResultsRequested);
    }

    public int getSolarActivityScoreFor(int row, int column) {
        int bottomrow = sz - 1;
        int rightMostColum = sz - 1;

        int score = getHeatValueFor(row, column);
        if (row > 0) score += getHeatValueFor(row - 1, column);
        if (row < bottomrow) score += getHeatValueFor(row + 1, column);

        if (column > 0) {
            score += getHeatValueFor(row, column - 1);
            if (row > 0) score += getHeatValueFor(row - 1, column - 1);
            if (row < bottomrow) score += getHeatValueFor(row + 1, column - 1);
        }

        if (column < rightMostColum) {
            score += getHeatValueFor(row, column + 1);
            if (row > 0) score += getHeatValueFor(row - 1, column + 1);
            if (row < bottomrow) score += getHeatValueFor(row + 1, column + 1);
        }

        return score;
    }

    public int getHeatValueFor(int row, int column) {
        return gridData[(row * sz) + column];
    }

}
