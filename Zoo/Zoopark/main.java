public class main {
public static void main(String[] args) {
    Zoo zoo = new Zoo();
    zoo.addAnimal(new Cow("Машка"));
    zoo.addAnimal(new Bear("Мишка", 60));
    zoo.addAnimal(new Platypus("Пыж"));
    zoo.addAnimal(new Woof("Серенький"));
    zoo.addAnimal(new Goat("Дымка"));
    zoo.addAnimal(new Bat("Кыц"));
    zoo.addAnimal(new Bear("Потапыч", 61));
    zoo.addAnimal(new Walrus("Тюля", 22));
    zoo.addAnimal(new Walrus("Рог", 17));
    System.out.println("Представляем наш зоопарк");
    zoo.showAll();
    System.out.println();
    System.out.println("Звери издают звуки");
    zoo.noise();
    System.out.println();
    System.out.println("Чемпион по бегу в нашем зоопарке");
    System.out.println(zoo.champByRun());
    System.out.println();
    System.out.println("Лучше всех летает в нашем зоопарке");
    System.out.println(zoo.champByFly());
    System.out.println();
    System.out.println("Лучше всех плавает в нашем зоопарке");
    System.out.println(zoo.champBySwim());
}
}
