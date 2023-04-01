import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Animal> animals = new ArrayList<>();

    public Aquarium(List<Animal> animals) {
        this.animals = animals;
    }

    public Aquarium() {
    }

    public void addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    public void showAll() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }
    private List<Swimable> swims() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }

        }
        return result;
    }

    public Animal champBySwim() {
        List<Swimable> start = swims();
        Swimable champ = start.get(0);
        for (Swimable swim : start) {
            if (champ.speedswim() < swim.speedswim()) {
                champ = swim;
            }
        }
        return (Animal) champ;
    }
    
    
}

