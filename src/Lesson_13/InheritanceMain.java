package Lesson_13;

public class InheritanceMain {

    public static void main(String[] args) {
        Hachiko h1 = new Hachiko("Akita", 10, "loyal", "friend", 4.5);

        Person owner = new Person("Yakamoto", 55, h1);
    }

}
