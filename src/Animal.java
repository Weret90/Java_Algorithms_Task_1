public class Animal {

    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) { //конструктор класса Animal
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() { //метод отображения данных
        System.out.printf("Вид животного: %s, кличка: %s, возраст: %d\n", getSpecies(), getName(), getAge());
    }
}
