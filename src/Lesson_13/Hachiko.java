package Lesson_13;

public class Hachiko extends Akita {

    double waitTime;

    public Hachiko(String name, int age, String friendly, String loyalty,
                   double waitTime) {
        super(name, age, friendly, loyalty);
        this.waitTime = waitTime;
    }


    @Override
    public void eat() {
        System.out.println("Eat whiskas");
    }

    @Override
    public void humanBehaviour() {
        System.out.println("Be loyal to human");
    }
}
