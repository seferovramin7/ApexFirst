package Lesson_4;

import java.util.Scanner;

public class SwitchLearning {

    public static void main(String[] args) {


        // 0 - 100 Cox Ucuz
        // 100 - 200 Ucuz
        // 200 - 500 Orta
        // 500 - 1000 Baha

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa qiymeti daxil edin : ");
        int qiymet = scanner.nextInt();

        if (qiymet < 100) {
            System.out.println("Qiymet cox ucuzdur");
        } else if (qiymet < 200) {
            System.out.println("Qiymet ucuzdur");
        } else if (qiymet < 500) {
            System.out.println("Qiymet ortadir");
        } else if (qiymet < 1000) {
            System.out.println("Qiymet bahadir");
        } else if (qiymet < 2000) {
            System.out.println("Qiymet Cox bahadir");
        } else if (qiymet < 3000) {
            System.out.println("Qiymet Dehset bahadir");
        } else if (qiymet < 4000) {
            System.out.println("Qiymet Fantastik bahadir");
        } else if (qiymet < 5000) {
            System.out.println("Dushun");
        } else {
            System.out.println("Almaga Deymez");
        }




        String message = "Qiymet ";

        switch (message){
            case "Cox ucuzdur":
                boolean b = qiymet < 100;
        }

    }

}
