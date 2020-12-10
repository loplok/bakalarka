package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Queen extends Piece{

    public Queen(int piecePosition, PlayerAlliance pieceAlliance, PieceType pieceType, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, pieceType, isFirstMove, isTaken,
                BoardConstants.QUEEN_CANDIDATE_MOVES);
    }
}
