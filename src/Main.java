import java.util.function.DoubleFunction;

/**
 * Created by jack on 7/9/17.
 */
public class Main {

    public static void main(String[] args) {
        String[] boardVisual =
                {" ", " ", " ", " ",
                 " ", "P", "K", " ",
                 " ", " ", " ", " ",
                 " ", " ", " ", " "};
        System.out.println(boardVisual[6]);
    }

}


/*
//was inside the main class
public static Board board = new Board();

    public static void main(String[] args) {
        for(int i=0; i<board.getBoard().length; i++){
            for(int j=0; j<board.getBoard()[i].length; j++){
                System.out.print(board.getBoard());
            }
            System.out.println();
        }
    }


 */
