/**
 * Created by jack on 7/9/17.
 */

public class Board {

    private String[] boardVisual =
            {" ", " ", " ", " ",
             " ", "P", "K", " ",
             " ", " ", " ", " ",
             " ", " ", " ", " "};


    private boolean[] boardOccupancy = new boolean[16];
    private Piece[] board = new Piece[16];


    public void transformBoardVisualIntoActualBoard(){
        for(int i=0; i<boardVisual.length; i++){
            if(boardVisual[i].equalsIgnoreCase(" ")){
                board[i] = null;
                boardOccupancy[i] = false;
            }else if(boardVisual[i].equalsIgnoreCase("P")){
                Pawn p = new Pawn();
                p.setPosition(i);
                board[i] = p;
                boardOccupancy[i] = true;
            }
        }
    }

    public boolean[] getBoardOccupancy() {
        return boardOccupancy;
    }

    public void setBoardOccupancy(boolean[] boardOccupancy) {
        this.boardOccupancy = boardOccupancy;
    }

    public Piece[] getBoard() {
        return board;
    }

    public void setBoard(Piece[] board) {
        this.board = board;
    }

    public String[] getBoardVisual() {
        return boardVisual;
    }

    public void updateBoardVisual(String[] boardVisual) {
        this.boardVisual = boardVisual;
        transformBoardVisualIntoActualBoard();
    }
}


//public class Board {
//
//    private boolean[][] boardOccupancy = new boolean[4][4];
//
//    private Piece[][] board = new Piece[4][4];
//
//    public Piece[][] getBoard() {
//        return board;
//    }
//
//    public void setBoard(Piece[][] board) {
//        this.board = board;
//    }
//
//    public boolean[][] getBoardOccupancy() {
//        return boardOccupancy;
//    }
//
//    public void setBoardOccupancy(boolean[][] boardOccupancy) {
//        this.boardOccupancy = boardOccupancy;
//    }
//}
