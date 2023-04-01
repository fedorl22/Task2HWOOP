
public class Platypus extends Mammal implements Walkable, Swimable{
    
    public Platypus(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Шшшшшшшшшш";
    }
    @Override
    public String feed() {
        return "Рыба,камыш";
    }
    @Override
    public int speedrun() {
        return 10;
    }
    @Override
    public int speedswim() {
        return 15;
    }
}
