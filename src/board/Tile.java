package board;

import board.utils.BoardConstants;
import pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

    private int tileNumber;
    private boolean isOccupied;

    private static final Map<Integer, EmptyTile> EMPTY_TILES = createAllEmptyTiles();

    private static Map<Integer,EmptyTile> createAllEmptyTiles() {
        final Map<Integer,EmptyTile> emptyTileMap = new HashMap<>();

        for (int i = 0; i < BoardConstants.TILES_TOTAL_NUM; i++) {
            emptyTileMap.put(i, new EmptyTile(i));
        }

       return emptyTileMap;
    }

    private Tile(int coordinate) {
        this.tileNumber = coordinate;
    }

    public int getTileCoordinate() {
        return this.tileNumber;
    }

    public static Tile createTile(final int tileNumber, final Piece piece) {
        return piece != null ? new OccupiedTile(tileNumber, piece) : EMPTY_TILES.get(tileNumber);
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();



    public static final class OccupiedTile extends Tile{

        private final Piece piece;

        OccupiedTile(int coordinate, Piece piece) {
            super(coordinate);
            this.piece = piece;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
        // TODO finish toString method after alliance stuff is done
    }



    public static final class EmptyTile extends Tile{

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
}


