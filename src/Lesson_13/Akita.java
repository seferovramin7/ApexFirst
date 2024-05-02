package Lesson_13;

public class Akita extends Dog {
    protected String loyalty;

    public Akita(String name, int age, String color, String friendly, String loyalty) {
        super(name, age, color, friendly);
        this.loyalty = loyalty;
    }

    public Akita(String name, int age, String friendly, String loyalty) {
        super(name, age, friendly);
        this.loyalty = loyalty;
    }

}
