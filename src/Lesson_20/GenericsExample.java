package Lesson_20;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }
}

public class GenericsExample {
    public static void main(String[] args) {

        Box box = new Box("sdF");
        Box box1 = new Box(1231243);

    }
}
