package net.room32.springersunspot.domain;

public class Location implements Comparable<Location> {
    private int row, column;
    private int solarActivityScore;

    public Location(int row, int column, int solarActivityScore) {
        this.row = row;
        this.column = column;
        this.solarActivityScore = solarActivityScore;
    }

    @Override
    public boolean equals(Object o) {   // auto-generated by IntelliJ, thus not unit tested.
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        if (row != location.row) return false;
        if (column != location.column) return false;
        if (solarActivityScore != location.solarActivityScore) return false;

        return true;
    }

    @Override
    public int hashCode() {             // auto-generated by IntelliJ, thus not unit tested.
        int result = row;
        result = 31 * result + column;
        return result;
    }

    @Override
    public String toString() {
        return ("(" + column + "," + row + " score:" + solarActivityScore + ")");
    }


    @Override
    public int compareTo(Location that) {
        return Integer.compare(this.solarActivityScore, that.solarActivityScore);
    }
}
