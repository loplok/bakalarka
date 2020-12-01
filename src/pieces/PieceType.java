package pieces;

public enum PieceType {

    PAWN("P") {
        @Override
        public boolean isKing() {
            return false;
        }

        @Override
        public boolean isRook() {
            return false;
        }

        @Override
        public boolean isPawn() {
            return true;
        }
    },

    BISHOP("B") {
        @Override
        public boolean isKing() {
            return false;
        }

        @Override
        public boolean isRook() {
            return false;
        }

        @Override
        public boolean isPawn() {
            return false;
        }
    },

    KNIGHT("N") {
        @Override
        public boolean isKing() {
            return false;
        }

        @Override
        public boolean isRook() {
            return false;
        }

        @Override
        public boolean isPawn() {
            return false;
        }
    },

    ROOK("P") {
        @Override
        public boolean isKing() {
            return false;
        }

        @Override
        public boolean isRook() {
            return true;
        }

        @Override
        public boolean isPawn() {
            return false;
        }
    },

    QUEEN("Q") {
        @Override
        public boolean isKing() {
            return false;
        }

        @Override
        public boolean isRook() {
            return false;
        }

        @Override
        public boolean isPawn() {
            return false;
        }
    },

    KING("P") {
        @Override
        public boolean isKing() {
            return true;
        }

        @Override
        public boolean isRook() {
            return false;
        }

        @Override
        public boolean isPawn() {
            return false;
        }
    };

    private String pieceType;

    PieceType(final String pieceType) {
            this.pieceType = pieceType;
    }

    public abstract boolean isKing();

    public abstract boolean isRook();

    public abstract boolean isPawn();

    @Override
    public String toString() {
        return this.pieceType;
    }
}
