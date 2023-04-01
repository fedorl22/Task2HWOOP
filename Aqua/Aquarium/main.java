public class main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(new Fish("Золотая рыбка", 3, 2, 0.20f));
        aquarium.addAnimal(new Fish("Щука", 1, 22, 1.5f));
        aquarium.addAnimal(new Turtle("Тортилла", 300, 110, 20));
        aquarium.addAnimal(new Walrus("Моржик", 10, 2100, 300,25));
        aquarium.addAnimal(new Walrus("Налимка", 4, 51, 3,35));
        System.out.println("Представляем наш Аквариум");
        aquarium.showAll();
        System.out.println();

        System.out.println();
        System.out.println("Лучше всех плавает в нашем Аквариуме");
        System.out.println(aquarium.champBySwim());
    }
    
}
