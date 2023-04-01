
public class Cow extends Herbivore implements Walkable{
    public Cow(String name){
        super(name);
    }
    
    
    @Override
    public String speak() {
        return "Myyyyyy";
    }
    @Override
    public int speedrun(){
       return 20; 
    }
}
