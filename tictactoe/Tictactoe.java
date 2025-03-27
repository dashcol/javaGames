package tictactoe;

import java.util.Scanner;

public class Tictactoe {
    
private Player player1,player2;
private Board board;
private int playernumber;

public static void main(String[] args) {
    Tictactoe t=new Tictactoe();
    t.StartGame();
}

public void StartGame(){
//get player
 Scanner sc= new Scanner(System.in);
player1=getDeatils(++playernumber);
player2=getDeatils(++playernumber);

while (player1.getSymbol()==player2.getSymbol()) {
    System.out.println("Plaese Enter a Different Symbol :");
    char symbol=sc.next().charAt(0);
    player2.setSymbol(symbol);
}
//create board
board=new Board(player1.getSymbol(),player2.getSymbol());

//play the game

boolean player1turn=true;
int  status=board.INCOMPLETE;
while(status==board.INCOMPLETE || status==board.INVALID){
    if(player1turn){
        System.out.println(player1.getName()+"'s turn");
System.out.println("Enter your cell co-ordintes");
System.out.println("x:");
int x=sc.nextInt();
System.out.println("y:");
int y=sc.nextInt();

status=board.move(x,y,player1.getSymbol());
if(status==board.INVALID){
    System.out.println("Invalid move");
    continue;
}
    }
    
    //player 2
    else{
        System.out.println(player2.getName()+"'s turn");
System.out.println("Enter your cell co-ordintes");
System.out.println("x:");
int x=sc.nextInt();
System.out.println("y:");
int y=sc.nextInt();

 status=board.move(x,y,player2.getSymbol());
if(status==board.INVALID){
    System.out.println("Invalid move");
    continue;
}
    }
    player1turn=!player1turn;
    board.print();

}

if(status==board.PLAYER1WINS){
 
    System.out.println("wohoo :)"+player1.getName()+"won");
}else if(status==board.PLAYER2WINS){
  
    System.out.println("wohoo :)"+player2.getName()+"won");
}else{
    System.out.println(":( its a DRAW"); 
}
sc.close();
}


private Player getDeatils(int num){
    Scanner sc= new Scanner(System.in);
System.out.print("Enter Player" +num+ "Name :");
String player1Name=sc.nextLine();
System.out.print("Enter Player"+num+ "Symbol :");
char p1Symbol=sc.next().charAt(0);

Player p=new Player(player1Name,p1Symbol);
  return p;
}

}
