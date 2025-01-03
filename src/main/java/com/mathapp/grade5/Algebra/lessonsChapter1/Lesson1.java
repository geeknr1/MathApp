package com.mathapp.grade5.Algebra.lessonsChapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javafx.stage.Stage;

public class Lesson1{
    private static Stage primaryStage;
    private static Quiz quiz;

    public void generateQuiz(){
        quiz.addQuizMultipleChoice("Type the following roman numbers in arabic digits: LXII, CLXV, CLXIII, XXXIII and CCCLXXXVII", Arrays.asList(new Pair("62, 163, 63, 25, 300", false), 
                                                                                                                                    new Pair("41, 165, 163, 33, 300", false),
                                                                                                                                    new Pair("62, 165, 163, 33, 387", true),
                                                                                                                                    new Pair("63, 50, 163, 35, 1554", false)));
        
        quiz.addQuizMultipleChoice("What is the smallest 4-digit natural number for which the digit sum is equal to the product of its digits?", Arrays.asList(new Pair("2134", false),
                                                                                                                                                  new Pair("1124", true),
                                                                                                                                                  new Pair("1421", false),
                                                                                                                                                  new Pair("1685", false)));
                                                                                                                                                 

        quiz.addQuizMultipleChoice("How many 2-digit natural numbers can be written using only even digits?", Arrays.asList(new Pair("45", true),
                                                                                                               new Pair("55", false),
                                                                                                               new Pair("60", false),
                                                                                                               new Pair("100", false)));

        quiz.addQuizMultipleChoice("Write all the 4-digit numbers using just the digits '0' and '3'. Find their sum afterwards.",  Arrays.asList(new Pair("20000", false),
                                                                                                                                   new Pair("2505", false),
                                                                                                                                   new Pair("45000", false),
                                                                                                                                   new Pair("25332", true)));

    }
}