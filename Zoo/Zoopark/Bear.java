
public class Bear extends Predator implements Walkable{
    private int speed;

    public Bear(String name, int speed) {
        super(name);
        this.speed=speed;
    }
    
    @Override
    public String speak() {
        return " Ррррррррр ";
    }

    @Override
    public int speedrun(){
       return speed; 
    }
    
}
