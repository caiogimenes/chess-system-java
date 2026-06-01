package boardgame;

public class Piece {
    protected Position position; // Why is there no getPosition method?
    private Board board;

    public Piece(Board board){
        this.board = board;
    }

    protected Board getBoard(){
        return this.board;
    }
}
