package Lesson_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("BInal", 101));
        studentList.add(new Student("AMollayev", 1024));
        studentList.add(new Student("CSevinj", 1030));
        studentList.add(new Student("BInal", 1301));
        studentList.add(new Student("AMollayev", 1402));
        studentList.add(new Student("CSevinj", 1200));


        studentList.sort(new Comparator<Student>() {
            public int compare(Student bu, Student o) {
                return bu.id.compareTo(o.id);
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
