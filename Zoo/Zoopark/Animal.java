
public abstract class Animal implements Speakable{
    private String name;



    public abstract String feed();

    public Animal(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Кличка: %s " , this.name))
                    .append(String.format("Питается: %s " , feed()))
                .append(String.format("Издает звук: %s " , speak()));
        return result.toString();
    }
}
