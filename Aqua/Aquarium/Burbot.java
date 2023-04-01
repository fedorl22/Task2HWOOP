public class Burbot extends Fish {
    private int speed;

    public Burbot(String name, int age, float length, float weight, int speed) {
        super(name, age, length, weight);
        this.speed=speed;
    }

    @Override
    public int speedswim() {
        return speed;
    }

}