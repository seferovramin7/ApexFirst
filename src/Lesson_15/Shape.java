package Lesson_15;

public abstract class Shape {

    abstract double calculateArea();

    abstract double calculateLength(int a, int b);

    double calculateLength(int a, int b, int c) {
        return a + b + c;
    }


}
