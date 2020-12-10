package board.moves;

import board.Board;
import pieces.Piece;
import pieces.Rook;

public abstract class Move {

    protected final Board board;
    protected final Piece pieceThatMoved;
    protected final int destinationOfPiece;

    private Move(final Board board, final Piece pieceThatMoved, final int destinationOfPiece) {
        this.board = board;
        this.pieceThatMoved = pieceThatMoved;
        this.destinationOfPiece = destinationOfPiece;
    }

    public Piece getPieceThatMoved() {
        return this.pieceThatMoved;
    }

    public int getDestinationCoordinate() {
        return this.destinationOfPiece;
    }

    public boolean isCapture() {
        return false;
    }

    public boolean isCastlingMove() {
        return false;
    }

    public Piece getAttackedPiece() {
        return null;
    }


    public static class CaptureMove extends Move {
        final Piece capturedPiece;

        @Override
        public boolean isCapture() {
            return true;
        }

        @Override
        public Piece getAttackedPiece() {
            return this.capturedPiece;
        }

        private CaptureMove(Board board, Piece pieceThatMoved, int destinationOfPiece, Piece capturedPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
            this.capturedPiece = capturedPiece;
        }
    }


    public static final class PawnMove extends Move {

        private PawnMove(Board board, Piece pieceThatMoved, int destinationOfPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
        }
    }


    public static class PawnCaptureMove extends CaptureMove {

        private PawnCaptureMove(Board board, Piece pieceThatMoved, int destinationOfPiece, Piece capturedPiece) {
            super(board, pieceThatMoved, destinationOfPiece, capturedPiece);
        }
    }


    public static final class PawnEnPassantAttackMove extends PawnCaptureMove {

        private PawnEnPassantAttackMove(Board board, Piece pieceThatMoved, int destinationOfPiece, Piece capturedPiece) {
            super(board, pieceThatMoved, destinationOfPiece, capturedPiece);
        }
    }


    public static final class  PawnJump extends Move {

        private PawnJump(Board board, Piece pieceThatMoved, int destinationOfPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
        }
    }


    public static class PawnPromotion extends Move {

        private PawnPromotion(Board board, Piece pieceThatMoved, int destinationOfPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
        }
    }


    public static final class MajorPieceMove extends Move {

        private MajorPieceMove(Board board, Piece pieceThatMoved, int destinationOfPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
        }
    }


    static abstract class  CastleMove extends Move {
        protected final Rook castleRook;
        protected final int rookPosition;
        protected final int castleRookDestination;

        private CastleMove(Board board, Piece pieceThatMoved, int destinationOfPiece,
                           final Rook castleRook, final int rookPosition, final int castleRookDestination) {
            super(board, pieceThatMoved, destinationOfPiece);
            this.castleRook = castleRook;
            this.rookPosition = rookPosition;
            this.castleRookDestination = castleRookDestination;
        }
    }


    public static class InsertMove extends Move {

        private InsertMove(Board board, Piece pieceThatMoved, int destinationOfPiece) {
            super(board, pieceThatMoved, destinationOfPiece);
        }
    }
    // TODO insert, queen castle, king castle
}