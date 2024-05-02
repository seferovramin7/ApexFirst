package Lesson_5;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        // 0.0000000   -> 0.99999999
        //  0   ->      99
        // 1.23452    ->      100.02343234
        //  1       ->      1000

        int zer = (int) (Math.random() * 100 + 1);
        System.out.println("Random reqem : " + zer);


        Scanner scanner = new Scanner(System.in);

        boolean won = false;

//        for (int i = 1; i < 30; i++) {

        while (won == false) {

            System.out.println("Zehmet olmasa texmininiz : ");
            int texmin = scanner.nextInt();

            if (texmin == 13 || zer == 13) {
                continue;
            }


            if (zer < texmin) {
                System.out.println("Boyuk dedin");
            } else if (zer > texmin) {
                System.out.println("Kicik dedin");
            } else {
                System.out.println("Tebrikler !!!!");
                won = true;
            }
        }

    }

}
