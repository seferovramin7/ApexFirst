package Lesson_14;

import java.util.Objects;

public class Person {
    String name;

    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Override - Run Time Polymorphism
    // Overload - Compile Time Polymorphism


    public String speak(String word) {
        return "Hello " + word;
    }



    public String speak(int price) {
        return "Hello " + price;
    }

    public String speak(String father, String name) {
        return name;
    }

    public int speak(int father, int name) {
        return name;
    }


}
