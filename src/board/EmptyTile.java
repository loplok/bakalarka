package board;

import pieces.Piece;

public class EmptyTile extends Tile{
    EmptyTile(int number) {
        super(number);
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPiece() {
        return null;
    }

    @Override
    public String toString() {
        return "-";
    }
}
