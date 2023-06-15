package lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.name = "Barsik";
        cat1.age = 6;
        Cat cat2 = new Cat();
        cat2.name = "Murka";
        cat2.color = "Black";
        cat2.age = 3;

        System.out.println("Cat " + cat2.name + " is " + cat2.color + " of age " + cat2.age);
        System.out.println("Cat " + cat1.name + " is " + cat1.color + " of age " + cat1.age);

        cat1.jump();
        cat2.jump();
    }
}
