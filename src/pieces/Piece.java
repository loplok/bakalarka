package pieces;

import board.player.PlayerAlliance;

public class Piece {
    protected final int piecePosition;
    protected PlayerAlliance pieceAlliance;
    private final boolean isFirstMove;



    public Piece(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        this.isFirstMove = isFirstMove;
    }
}
