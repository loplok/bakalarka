package pieces;

import board.Board;
import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Knight extends Piece{

    public Knight(int piecePosition, PlayerAlliance pieceAlliance, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, PieceType.KNIGHT, isFirstMove, isTaken, BoardConstants.KNIGHT_CANDIDATE_MOVES);
    }

    @Override
    public String toString() {
        return PieceType.KNIGHT.toString();
    }


    private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.FIRST_COLUMN[currentPosition] && (candidateOffset == -17 || candidateOffset == -10 ||
                candidateOffset == 6 || candidateOffset == 15);
    }

    private static boolean   isSecondColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.SECOND_COLUMN[currentPosition] && (candidateOffset == -10 || candidateOffset == 6);
    }

    private static boolean isSeventhColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.SEVENTH_COLUMN[currentPosition] && (candidateOffset == -6 || candidateOffset == 10);
    }

    private static boolean isEightColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.EIGHT_COLUMN[currentPosition] && (candidateOffset == -15 || candidateOffset == -6
                || candidateOffset == 10 || candidateOffset == 17);
    }

}
