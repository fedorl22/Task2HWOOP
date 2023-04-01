public class Walrus extends Mammal implements Swimable {
    private int speed;
    public Walrus(String name, int speed) {
        super(name);
       this.speed=speed; 
    }
       
    @Override
    public String speak() {
        return "Фырк";
    }

    @Override
    public String feed() {
        return "Рыба";
    }
    @Override
    public int speedswim() {
        return speed;
    }

}

