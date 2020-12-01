package board;

public abstract class Tile {
    private int tileNumber;
    private boolean isOccupied;

    public Tile(int number) {
        this.tileNumber = number;
    }

    public int getTileNumber() {
        return this.tileNumber;
    }


}
