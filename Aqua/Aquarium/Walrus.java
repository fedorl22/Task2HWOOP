public class Walrus extends Mammal implements Swimable {
    private int speed;

    public Walrus(String name, int age, float length, float weight, int speed) {
        super(name, age, length, weight);
        this.speed = speed;
    }

    @Override
    public int speedswim() {
        return speed;
    }

}
