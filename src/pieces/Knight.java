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
}
