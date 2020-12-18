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

    private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.FIRST_COLUMN[currentPosition]
                && (candidateOffset == -1 ||candidateOffset == -9 || candidateOffset == 7);
    }

    private static boolean isEightColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.EIGHT_COLUMN[currentPosition]
                && (candidateOffset == -7 || candidateOffset == 1 || candidateOffset == 9);
    }
}
