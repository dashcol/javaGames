package othello;
public class Player{
private String name;
private char color;
    public Player(String name,char color){
        setColor(color);
        setName(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setColor(char color){
        this.color=color;
    }
    public char getColor(char color){
        return this.color;
    }
}