package Lesson_23;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> rainbow = Arrays.asList(2134, 1234, 33, 232);

        int sum = rainbow.stream()
                .mapToInt(r -> r * 3)
                .sum();

        System.out.println(sum);

    }
}
