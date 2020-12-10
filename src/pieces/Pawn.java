package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Pawn extends Piece{

    public Pawn(int piecePosition, PlayerAlliance pieceAlliance, PieceType pieceType, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, pieceType, isFirstMove, isTaken, BoardConstants.PAWN_CANDIDATE_MOVES);
    }
}
