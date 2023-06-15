package lesson2;

public class Cat {
    String name;
    String color;
    int age;


    void jump() {
        if (age < 5) {
            System.out.println(name + " jumps");
        }
    }

    void voice() {
        System.out.println(name + " meows");
    }
}
