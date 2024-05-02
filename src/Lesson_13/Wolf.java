package Lesson_13;

public class Wolf {

    final String name;

    int age;

    String color;


    public Wolf(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Eat sheep");
    }

    public void humanBehaviour() {
        System.out.println("Eat human");
    }

    public final boolean breathing() {
        return true;
    }

}
