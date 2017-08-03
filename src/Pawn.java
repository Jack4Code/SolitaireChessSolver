import java.util.ArrayList;

/**
 * Created by jack on 7/9/17.
 */
public class Pawn implements Piece {

    private int position; //must be a number between 0 and 15

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public ArrayList<String> possibleMoves(Board board) {
        ArrayList<String> legalMoves = new ArrayList<String>();
        if(position>3){
            if(position==4 || position==8 || position==12){
                if(board.getBoardOccupancy()[position-3]==true){
                    legalMoves.add("-3");
                }
            }else if(position==7 || position==11 || position==15){
                if(board.getBoardOccupancy()[position-5]==true){
                    legalMoves.add("-5");
                }
            }else{
                if(board.getBoardOccupancy()[position-5]==true){
                    legalMoves.add("-5");
                }
                if(board.getBoardOccupancy()[position-3]==true){
                    legalMoves.add("-3");
                }
            }
        }
        return legalMoves;
    }

    @Override
    public void makeMove(Board board, int move) {
        ArrayList<String> legalMoves = possibleMoves(board);
        String stringMove = Integer.toString(move);
        if(legalMoves.contains(stringMove)){
            position = position + move;
        }

    }
}
