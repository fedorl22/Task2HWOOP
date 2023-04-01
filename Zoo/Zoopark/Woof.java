public class Woof extends Predator implements Walkable {
    public Woof(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Ауууу";
    }

    @Override
    public int speedrun() {
        return 50;
    }
}
