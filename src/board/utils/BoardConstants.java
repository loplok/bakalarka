package board.utils;

import java.util.HashMap;
import java.util.Map;

public class BoardConstants {
    public static final int TILES_TOTAL_NUM = 64;
    public static final int[] BISHOP_CANDIDATE_MOVES = {-9, -7, 7, 9};
    public static final int[] KING_CANDIDATE_MOVES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public static final int[] KNIGHT_CANDIDATE_MOVES = {-17, -15, -10, -6, 6, 10, 15, 17};
    public static final int[] PAWN_CANDIDATE_MOVES = {8, 16, 7, 9};
    public static final int[] QUEEN_CANDIDATE_MOVES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public static final int[] ROOK_CANDIDATE_MOVES = {-8, -1, 1, 8};


    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(6);
    public static final boolean[] EIGHT_COLUMN = initColumn(7);

    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;

    public static final boolean[] FIRST_ROW = initRow(0);
    public static final boolean[] SECOND_ROW = initRow(8);
    public static final boolean[] THIRD_ROW = initRow(16);
    public static final boolean[] FOURTH_ROW = initRow(24);
    public static final boolean[] FIFTH_ROW = initRow(32);
    public static final boolean[] SIXTH_ROW = initRow(40);
    public static final boolean[] SEVENTH_ROW = initRow(48);
    public static final boolean[] EIGHT_ROW = initRow(56);

    private static final String[] ALGEBRAIC_NOTATION = initializeAlgebraicNotation();
    public static final Map<String, Integer> POSITION_TO_COORDINATE = initializePositionToCoordinate();


    private static boolean[] initRow(int initNumber) {
        final boolean[] rows = new boolean[NUM_TILES];
        do {
            rows[initNumber] = true;
            initNumber++;
        }
        while (initNumber % NUM_TILES_PER_ROW != 0);
        return rows;
    }

    private static Map<String, Integer> initializePositionToCoordinate() {
        final Map<String, Integer> positionToCoordinate = new HashMap<>();
        for(int i =0; i < NUM_TILES; i++) {
            positionToCoordinate.put(ALGEBRAIC_NOTATION[i], i);
        }
        return positionToCoordinate;
    }


    private static boolean[] initColumn(int columnNumber) {
        final boolean[] column = new boolean[64];

        do {
            column[columnNumber] = true;
            columnNumber += 8;
        } while (columnNumber < 64);
        return column;
    }


    public static boolean isValidTileCoordinate(final int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }


    private static String[] initializeAlgebraicNotation() {
        return new String[]{
                "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8",
                "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7",
                "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6",
                "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5",
                "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4",
                "a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
                "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2",
                "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"};
    }


    public static String getPositionAtCoordinate(final int destinationCoordinate) {
        return ALGEBRAIC_NOTATION[destinationCoordinate];
    }


    public static int getCoordinateAtPosition(final String position) {
        return POSITION_TO_COORDINATE.get(position);

    }
}
