package com.mathapp.grade5.Algebra.ch1Lessons;

import java.util.Arrays;

import javafx.stage.Stage;

public class Quiz4{
    private static Stage primaryStage;
    private static Quiz quiz4;

    public void generateQuiz(){
        quiz4.addQuizMultipleChoice("Round to hundreds the number 857", Arrays.asList(new Pair("800", false), 
                                                                                      new Pair("870", false),
                                                                                      new Pair("743", false),
                                                                                      new Pair("900", true)));
        
        quiz4.addQuizMultipleChoice("Approximate by subtracting to tens the number 2056", Arrays.asList(new Pair("2025", false),
                                                                                                        new Pair("5000", false),
                                                                                                        new Pair("2050", true),
                                                                                                        new Pair("3000", false)));
                                                                                                                                                 

        quiz4.addQuizMultipleChoice("Approximate by adding to hundreds the number 13783", Arrays.asList(new Pair("13800", true),
                                                                                                        new Pair("12546", false),
                                                                                                        new Pair("11323", false),
                                                                                                        new Pair("79863", false)));

        quiz4.addQuizMultipleChoice("Round to tens the number 2013",  Arrays.asList(new Pair("2000", false),
                                                                                    new Pair("2010", true),
                                                                                    new Pair("2016", false),
                                                                                    new Pair("2017", false)));

        quiz4.addQuizSingleChoice("Approximate by adding to hundreds the number 7254", "7300");
    }
}