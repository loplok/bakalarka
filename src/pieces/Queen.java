package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Queen extends Piece{

    public Queen(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, PieceType.QUEEN, isFirstMove, isTaken,
                BoardConstants.QUEEN_CANDIDATE_MOVES);
    }

    @Override
    public String toString() {
        return PieceType.QUEEN.toString();
    }
}
