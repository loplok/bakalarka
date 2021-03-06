package pieces;

import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class King extends Piece{

    private boolean isCastled;
    private final boolean canKingSideCastle;
    private final boolean canQueenSideCastle;
    private boolean isInCheck;
    private final static int[] CANDIDATE_MOVE_COORDINATE= {-9, -8, -7, -1, 1, 7, 8, 9};

    public King(int piecePosition, PlayerAlliance pieceAlliance, boolean isInCheck) {
        super(piecePosition, pieceAlliance, PieceType.KING, true, false,
                BoardConstants.KING_CANDIDATE_MOVES);
        this.isCastled = false;
        this.canQueenSideCastle = false;
        this.isInCheck = isInCheck;
        this.canKingSideCastle = false;
    }

    public boolean isCastled() {
        return this.isCastled;
    }

    private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.FIRST_COLUMN[currentPosition] && (candidateOffset == -9 || candidateOffset == -1 ||
                candidateOffset == 7);
    }

    private static boolean  isEightColumnExclusion(final int currentPosition, final int candidateOffset) {
        return BoardConstants.EIGHT_COLUMN[currentPosition] && (candidateOffset == 9 || candidateOffset == 1 ||
                candidateOffset == -7);
    }



    @Override
    public String toString() {
        return PieceType.KING.toString();
    }
}
