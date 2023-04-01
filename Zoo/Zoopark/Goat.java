public class Goat extends Herbivore implements Walkable{
    public Goat(String name){
        super(name);
    }
    
    
    @Override
    public String speak() {
        return "Бееее";
    }
    @Override
    public int speedrun(){
       return 30; 
    }
}
