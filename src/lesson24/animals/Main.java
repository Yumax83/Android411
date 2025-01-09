package lesson24.animals;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println(animal);
//        animal.voice();

        Cat animal1 = new Cat();
        animal1.voice();
        animal1.voice("Мурзик");

       Dog animal2 = new Dog();
        animal2.voice();
    }
}
