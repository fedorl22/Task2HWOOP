public abstract class Animal {
    private String name;
    private int age;
    private float length;
    private float weight;

    public Animal(String name, int age, float length, float weight) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getLength() {
        return length;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Кличка: %s " , this.name))
                    .append(String.format("Возраст в годах: %s " , this.getAge()))
                .append(String.format("Длина: %s см.", this.getLength()))
                .append(String.format("Вес: %s кг." , this.getWeight()));
        return result.toString();
    }
}
