
public abstract class Herbivore extends Mammal {
    public Herbivore(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Сено-солома";
    }


}
