package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Bishop extends Piece{

    public Bishop(int piecePosition, PlayerAlliance pieceAlliance, PieceType pieceType, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, pieceType, isFirstMove, isTaken, BoardConstants.BISHOP_CANDIDATE_MOVES);
    }
}
