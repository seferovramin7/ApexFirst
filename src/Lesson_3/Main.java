package Lesson_3;

import Lesson_13.Akita;
import Lesson_13.Hachiko;
import java.util.Scanner;

public class Main extends Hachiko{
    public Main(String name, int age, String friendly, String loyalty, double waitTime) {
        super(name, age, friendly, loyalty, waitTime);
    }

    public static void main(String[] args) {

        int q = 15;
        double p = 15.3;
        String cumle = "Java Dersi 15 15.3";

        // simvol -> character

        boolean svetofor = false;
        char t = '.';


        // ctrl + /
        // command + /
        Scanner im = new Scanner(System.in);

        System.out.println("Zehmet olmasa x daxil edin :");
        int x = im.nextInt();

        System.out.println("Zehmet olmasa y daxil edin :");
        int y = im.nextInt();

        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;


        System.out.println("Cem : " + a);
        System.out.println("Chixma : " + b);
        System.out.println("Vurma : " + c);
        System.out.println("Bolme : " + d);
    }
}