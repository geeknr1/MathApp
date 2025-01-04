package com.mathapp.grade5.Algebra.ch1Lessons;

import java.util.Arrays;

import javafx.stage.Stage;

public class Quiz2{
    private static Stage primaryStage;
    private static Quiz quiz2;

    public void generateQuiz(){
        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 1, ..., 9, 27, 81, 243", Arrays.asList(new Pair("3", true), 
                                                                                                                      new Pair("5", false),
                                                                                                                      new Pair("7", false),
                                                                                                                      new Pair("9", false)));
        
        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 3, 7, 11, 15, ..., ..., 27, 31, ..., ...", Arrays.asList(new Pair("16, 17, 18, 19", false),
                                                                                                                                                  new Pair("18, 23, 32, 8", true),
                                                                                                                                                  new Pair("19, 23, 35, 39", false),
                                                                                                                                                  new Pair("9, 8, 7, 6", false)));
                                                                                                                                                 

        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 4, 12, 36, 108, 324, ...", Arrays.asList(new Pair("900", true),
                                                                                                               new Pair("972", false),
                                                                                                               new Pair("1000", false),
                                                                                                               new Pair("870", false)));

        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 8, ..., 20, 26, 32, 38",  Arrays.asList(new Pair("17", false),
                                                                                                                                   new Pair("16", false),
                                                                                                                                   new Pair("15", false),
                                                                                                                                   new Pair("14", true)));

        quiz2.addQuizSingleChoice("Complete the following string of numbers: 1, 2, ..., 8, 16", "4");
    }
}