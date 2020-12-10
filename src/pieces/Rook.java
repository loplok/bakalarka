package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Rook extends Piece{

    public Rook(int piecePosition, PlayerAlliance pieceAlliance, PieceType pieceType, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, pieceType, isFirstMove, isTaken, BoardConstants.ROOK_CANDIDATE_MOVES);
    }
}
