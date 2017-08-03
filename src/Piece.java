import java.util.ArrayList;

/**
 * Created by jack on 7/9/17.
 */
public interface Piece {

    public ArrayList<String> possibleMoves(Board board);
    public void makeMove(Board board, int move);
}
