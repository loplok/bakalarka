package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Bishop extends Piece{

    public Bishop(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, PieceType.BISHOP, isFirstMove, isTaken, BoardConstants.BISHOP_CANDIDATE_MOVES);
    }

    @Override
    public String toString() {
        return PieceType.BISHOP.toString();
    }
}
