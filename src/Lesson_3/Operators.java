package Lesson_3;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        int zer = (int) (10 * Math.random()) + 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Texmin et : ");
        int texmin = scanner.nextInt();

        System.out.println("Random reqem : " + zer);
        System.out.println("Sizin texmin : " + texmin);


        boolean qalib = texmin == zer;


        System.out.println(qalib);


        int c = 10;


                if(c % 2 == 0){

                }else {

                }



        if (texmin == zer) {
            System.out.println("Tebrikler duzgun texmin etdiniz !!!!");
        } else if (texmin > zer) {
            System.out.println("Boyuk dediniz");
        } else {
            System.out.println("Bextinizi bir daha sinayin !!!!");
        }


    }
}
