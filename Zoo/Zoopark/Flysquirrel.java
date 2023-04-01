public class Flysquirrel extends Herbivore implements Walkable, Flyable{
    public Flysquirrel(String name) {
        super(name);
    }
    
    @Override
    public String speak() {
        return " Хрум ";
    }

    @Override
    public int speedrun(){
       return 30; 
    }

    @Override
    public int speedfly() {
        
        return 40;
    }
}
