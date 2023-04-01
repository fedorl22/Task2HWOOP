public class Fish extends Animal implements Swimable {
    private int speed;
    public Fish(String name, int age, float length, float weight) {
    super(name, age, length, weight);

    }
    

    @Override
    public int speedswim() {
        return speed;
    }
    }