package Lesson_19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnumLearning {
    public static void main(String[] args) {


        String text = "Inal Mollayev wfd qwefwd iwff asdfs Iadf";

        Pattern pattern = Pattern.compile("\\bI\\w+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }


    }
}
