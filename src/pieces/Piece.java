package pieces;

import board.player.PlayerAlliance;

public class Piece {
    protected final int piecePosition;
    protected PlayerAlliance pieceAlliance;
    private final boolean isFirstMove;
    private static int[] CANDIDATE_MOVE_COORDINATE = new int[10];

    // TODO figure out how i want to approach

    public Piece(int piecePosition, PlayerAlliance pieceAlliance, final PieceType pieceType,
                 final boolean isFirstMove, final boolean isTaken,
                 final int[] candidateMoves) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        this.isFirstMove = isFirstMove;
        this.CANDIDATE_MOVE_COORDINATE = candidateMoves;
    }
}
