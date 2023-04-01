import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio = new Radio();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public Zoo() {
    }

    public void addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    public void showAll() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }

    public void noise() {
        for (Speakable speak : noises()) {
            System.out.println(speak.speak());
        }
    }

    private List<Speakable> noises() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : animals) {
            result.add(animal);
        }
        result.add(radio);
        return result;
    }

    private List<Walkable> runners() {
        List<Walkable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                result.add((Walkable) animal);
            }

        }
        return result;
    }

    public Animal champByRun() {
        List<Walkable> start = runners();
        Walkable champ = start.get(0);
        for (Walkable runner : start) {
            if (champ.speedrun() < runner.speedrun()) {
                champ = runner;
            }
        }
        return (Animal) champ;
    }
    private List<Flyable> flyers() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }

        }
        return result;
    }

    public Animal champByFly() {
        List<Flyable> start = flyers();
        Flyable champ = start.get(0);
        for (Flyable flyer : start) {
            if (champ.speedfly() < flyer.speedfly()) {
                champ = flyer;
            }
        }
        return (Animal) champ;
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
                champ=swim;
            }
        } 
        return (Animal)champ;
    }
}

