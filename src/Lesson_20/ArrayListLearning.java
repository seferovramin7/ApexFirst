package Lesson_20;

import java.util.HashMap;
import java.util.Map;

public class ArrayListLearning {
    public static void main(String[] args) {
        // I N A L
        String name = "INALIIIII";
        Map<Character, Integer> map = new HashMap<>();

        // ({)}

        for (Character c : name.toCharArray()) {
            Integer say = map.get(c);
            if (say == null) {
                map.put(c, 1);
            } else {
                map.put(c, say + 1);
            }
        }

        for (Map.Entry e : map.entrySet()) {
            System.out.println(e);
        }

        map.remove("I");


    }
}
