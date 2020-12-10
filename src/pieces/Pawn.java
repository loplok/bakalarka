package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Pawn extends Piece{

    public Pawn(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, PieceType.PAWN, isFirstMove, isTaken, BoardConstants.PAWN_CANDIDATE_MOVES);
    }

    public Pawn(int piecePosition, PlayerAlliance pieceAlliance) {
        super(piecePosition, pieceAlliance, PieceType.PAWN, true, false,
                BoardConstants.PAWN_CANDIDATE_MOVES);
    }

    @Override
    public String toString() {
        return PieceType.PAWN.toString();
    }
}
