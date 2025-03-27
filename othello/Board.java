package othello;

public class Board {
  private char board[][]; 
   private int boardSize=8;
   private char player1color,player2color;
   private int count;
   private static final char EMPTY=' ';



public void print(){
    for(int i=0;i<boardSize;i++){
        for(int j=0;j<boardSize;j++){
            System.out.println("_".repeat(30));
            System.out.println("|" + board[i][j] + "|");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("_".repeat(30));
}
}
