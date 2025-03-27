package tictactoe;

public class Player {
   private String name;
   private char symbol;
   
public Player(String name,char symbol){
    setName(name);
    setSymbol(symbol);
}

   String getName(){
    return this.name;
   }
   void setName(String name){
    this.name=name;
   }

   char getSymbol(){
    return this.symbol;
   }
   void setSymbol(char symbol){
    this.symbol=symbol;
   }
}
