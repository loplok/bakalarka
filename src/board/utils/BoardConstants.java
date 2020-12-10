package board.utils;

public class BoardConstants {
    public static final int TILES_TOTAL_NUM = 64;
    public static final int[] BISHOP_CANDIDATE_MOVES = {-9, -7, 7, 9};
    public static final int[] KING_CANDIDATE_MOVES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public static final int[] KNIGHT_CANDIDATE_MOVES = {-17, -15, -10, -6, 6, 10, 15, 17};
    public static final int[] PAWN_CANDIDATE_MOVES = {8, 16, 7, 9};
    public static final int[] QUEEN_CANDIDATE_MOVES = {-9, -8, -7, -1, 1, 7, 8, 9};
    public static final int[] ROOK_CANDIDATE_MOVES = {-8, -1, 1, 8};
}
