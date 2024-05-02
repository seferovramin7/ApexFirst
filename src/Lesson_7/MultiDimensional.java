package Lesson_7;

public class MultiDimensional {
    public static void main(String[] args) {


        String[] aile1 = {"Dadash", "Kamil", "Yusif"};
        String[] aile2 = {"Firuze", "Perviz", "Orxan"};
        String[] aile3 = {"Leyla", "Letif", "Letife"};

        String[][] nesil = {aile1, aile2, aile3};

        Generation rustemovlar = new Generation(nesil);

        Integer a = 7;
        int b = 7;



        double v = a.doubleValue();

        System.out.println(v);

//        rustemovlar.capEdenMethod();


    }
}
