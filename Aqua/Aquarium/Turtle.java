public class Turtle extends Animal implements Swimable {
    private int speed;

    public Turtle(String name, int age, float length, float weight) {
        super(name, age, length, weight);

    }

    @Override
    public int speedswim() {
        return speed;
    }

}
