public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }
    
    @Override
    public String feed() {
        return "Комарики";
    }

    @Override
    public String speak() {
        return "ФФФФФиииии";
    }
    @Override
    public int speedfly() {
        return 65;
    }
}
