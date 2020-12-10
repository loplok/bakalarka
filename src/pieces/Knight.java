package pieces;

import board.Board;
import board.player.PlayerAlliance;
import board.utils.BoardConstants;

public class Knight extends Piece{

    public Knight(int piecePosition, PlayerAlliance pieceAlliance, PieceType pieceType, boolean isFirstMove, boolean isTaken) {
        super(piecePosition, pieceAlliance, pieceType, isFirstMove, isTaken, BoardConstants.KNIGHT_CANDIDATE_MOVES);
    }
}
