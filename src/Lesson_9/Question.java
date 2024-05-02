package Lesson_9;

import java.util.Arrays;

public class Question {

    Description description;

    String[] variants;

    int correctVariant;


    public Question(Description description, String[] variants, int correctVariant) {
        this.description = description;
        this.variants = variants;
        this.correctVariant = correctVariant;
    }
}
