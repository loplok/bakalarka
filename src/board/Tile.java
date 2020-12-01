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

    public Tile(int coordinate) {
        this.tileNumber = coordinate;
    }

    public int getTileCoordinate() {
        return this.tileNumber;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();
}
