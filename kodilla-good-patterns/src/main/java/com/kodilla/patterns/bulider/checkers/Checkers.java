package com.kodilla.patterns.bulider.checkers;

public class Checkers {

    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    public Checkers(Board board, String playerOne, String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class CheckersBulider {

        private Board board = new Board();
        private String playerOne = "";
        private String playerTwo = "";


        public CheckersBulider PlayerOne(String playerOne) {
            this.playerOne = playerOne;
            return this;
        }

        public CheckersBulider PlayerTwo(String playerTwo) {
            this.playerTwo = playerTwo;
            return this;
        }

        public CheckersBulider Figure(String figureType, String figureColor, int x, int y) {
            if (x > Board.MAX_INDEX || x<Board.MIN_INDEX || y > Board.MAX_INDEX || y<Board.MIN_INDEX) {
                throw new IllegalArgumentException("x and y sould be in the randge between " + Board.MIN_INDEX + " and " + Board.MAX_INDEX);
            }
            if (board.getFigure(x, y) == null) {
                board.setFigure(FigureFactory.makeFigure(figureType, figureColor), x, y);
            }else {
                throw new IllegalArgumentException("Position " + x + " and " + y + " is already in the occupied");
            }return this;
        }

        public Checkers build() {
            if (playerOne.length() == 0) {
                throw new IllegalArgumentException("There is no player one specified");
            }
            if (playerTwo.length() == 0) {
                throw new IllegalArgumentException("There is no player two specified");
            }
            boolean white = false, black = false;
            for (int x = Board.MIN_INDEX; x < Board.MAX_INDEX; x++) {
                for (int y = Board.MIN_INDEX; y < Board.MAX_INDEX; y++) {
                    Figure figure = board.getFigure(x, y);
                    if (figure != null) {
                        if (figure.getColor().equals(Figure.BLACK));
                        black = true;
                    }else {
                        white = true;
                    }
                }
            }
            if (!(white && black)) {
                throw new IllegalArgumentException("There is on figures of both colors on the board");
            }
            return new Checkers(board, playerOne, playerTwo);
        };

    }
}
