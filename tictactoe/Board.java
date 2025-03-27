package tictactoe;

public class Board {
 private char board[][]; 
 private int boardSize=3;
 private char player1Symbol,player2Symbol;
 private int count;
 private static final char EMPTY=' ';  
 public static final int PLAYER1WINS=1;
 public static final int PLAYER2WINS=2;
 public static final int DRAW=3;
 public static final int INCOMPLETE=4;
 public static final int INVALID=4;




 public Board(char player1Symbol,char player2Symbol){
for(int i=0;i<boardSize;i++){
   for(int j=0;j<boardSize;j++){
    board[i][j]=EMPTY;
   } 
}
this.player1Symbol=player1Symbol;
this.player2Symbol=player2Symbol;
 }

 public void print(){
   System.out.println("--------------------");
   for(int i=0;i<boardSize;i++){
      for(int j=0;j<boardSize;j++){
         System.out.print("|"+board[i][j]+"|");
      }
      System.out.println();
   } 
   System.out.println();
   System.out.println("--------------------");
 }

public int move(int x,int y,char symbol){
   if(( x<0 || x>boardSize || y<0 ||y>boardSize|| board[x][y]!=EMPTY   )){
      return INVALID;
   }
//move
 board[x][y]=symbol;
 count++;

 //winning condiiton
 //row
 if(board[x][0]==board[x][1] && board[x][0]==board[x][2]){
   return symbol==player1Symbol?PLAYER1WINS:PLAYER2WINS;
 }
 //column
 if(board[0][y]==board[1][y] && board[0][y]==board[2][y]){
  return symbol==player1Symbol?PLAYER1WINS:PLAYER2WINS;
 }
 //diagonal
 if(board[0][0]!=EMPTY && board[0][0]==board[1][1]&& board[0][0]==board[2][2]){
   return symbol==player1Symbol?PLAYER1WINS:PLAYER2WINS;
 }
 if( board[0][2]!=EMPTY && board[0][2]==board[1][1]&& board[0][2]==board[2][0]){
   return symbol==player1Symbol?PLAYER1WINS:PLAYER2WINS;
 }
 if(count==boardSize*boardSize){
   return DRAW;
 }
 return INCOMPLETE;
}


}
