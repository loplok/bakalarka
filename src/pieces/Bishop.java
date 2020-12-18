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

    private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.FIRST_COLUMN[currentPosition] && (candidateOffset == -9 || candidateOffset == 7);
    }

    private static boolean isEightColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.EIGHT_COLUMN[currentPosition] && (candidateOffset == -7 || candidateOffset == 9);
    }
}
