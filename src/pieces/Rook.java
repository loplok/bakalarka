package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Rook extends Piece{

    public Rook(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, PieceType.ROOK, isFirstMove, isTaken, BoardConstants.ROOK_CANDIDATE_MOVES);
    }

    @Override
    public String toString() {
        return PieceType.ROOK.toString();
    }
}
