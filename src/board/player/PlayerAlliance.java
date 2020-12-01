package board.player;


public enum PlayerAlliance {
    WHITE {
        @Override
        public String toString() {
            return "White player";
        }

        @Override
        public int getDirection() {
            return -1;
        }

        @Override
        public int getOppositeDirection() {
            return 1;
        }

        @Override
        public boolean isBlack() {
            return false;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public Player choosePlayer(final Player whitePlayer, final Player blackPlayer) {
            return whitePlayer;
        }
    },

    BLACK {
        @Override
        public String toString() {
            return "Black player";
        }

        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public int getOppositeDirection() {
            return -1;
        }

        @Override
        public boolean isBlack() {
            return true;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public Player choosePlayer(final Player whitePlayer, final Player blackPlayer) {
            return blackPlayer;
        }
    };

    public abstract String toString();
    public abstract int getDirection();
    public abstract int getOppositeDirection();

    public abstract boolean isBlack();
    public abstract boolean isWhite();

    public abstract Player choosePlayer(final Player whitePlayer,
                                        final Player blackPlayer);
}