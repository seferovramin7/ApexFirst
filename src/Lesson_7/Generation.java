package Lesson_7;

public class Generation {


    String[][] aileler;


    public Generation(String[][] aileler) {
        this.aileler = aileler;
    }

    int capEdenMethod() {
        int elementSayi = 0;

        for (String[] strings : this.aileler) {
            for (String string : strings) {
                elementSayi++;
                System.out.println(string);
            }
        }
        return elementSayi;
    }
}
