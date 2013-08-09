package net.room32.springersunspot;

import net.room32.springersunspot.domain.Grid;
import net.room32.springersunspot.domain.Location;
import java.util.List;

public class SunSpotAnalyser {

    private int numberOfResultsRequested;
    private int gridSize;
    int[] gridData;


    public String analyse(String input) {

        parse(input);
        List<Location> topLocations = new Grid(gridSize, gridData).getTopLocations(numberOfResultsRequested);

        String output = "";
        for (Location location : topLocations) {
            output += location.toString();
        }

        return output;
    }

    private void parse(String input) {
        String[] glob = input.split("[ ]+");

        numberOfResultsRequested = Integer.parseInt(glob[0]);
        gridSize = Integer.parseInt(glob[1]);
        gridData = new int[glob.length-2];

        for (int i = 0; i < gridData.length; i++) {
            gridData[i] = Integer.parseInt(glob[i + 2]);
        }
    }
}
