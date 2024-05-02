package Lesson_5;

public class DoWhile {
    public static void main(String[] args) {


        String[] adlar = new String[50];
        int[] yashlar = new int[50];
        double[] doubles = new double[50];
        boolean[] booleans = new boolean[50];


        adlar[0] = "Orxan";
        adlar[1] = "Kamil";
        adlar[2] = "Tural";
        adlar[3] = "Fuad";
        adlar[4] = "Celal";
        adlar[45] = "Dadash";

        System.out.println(adlar.length);


        // foreach

        for (String ad : adlar){
            System.out.println(ad);
        }


//        for (int i = 0; i < adlar.length; i++) {
//            System.out.println(adlar[i]);
//        }







    }
}
