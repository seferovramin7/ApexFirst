package Lesson_8;

public class Main {


    public static void main(String[] args) {

        Car toyota = new Car("Toyota", "Corolla");
        Car vw = new Car("Toyota", "Corolla");
        Car audi = new Car("Toyota", "Corolla");

        Car[] cars = {toyota, vw, audi};


        for (Car car : cars){
            System.out.println(car);
        }

    }
}
