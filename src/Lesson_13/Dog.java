package Lesson_13;

public class Dog extends Wolf {


    String friendly;

    public Dog(String name, int age, String color, String friendly) {
        super(name, age, color);
        this.friendly = friendly;
    }

    public Dog(String name, int age,   String friendly) {
        super(name, age);
        this.friendly = friendly;
    }
}
