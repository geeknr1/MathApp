package com.mathapp.grade5.Algebra.lessonsChapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javafx.stage.Stage;

public class Lesson1{
    private static Stage primaryStage;
    private static HashMap<String, List<Pair>> questions = new HashMap<>();
    private static HashMap<String, Pair> completeAnswer = new HashMap<>();
    private int questionNR = 0;
    private int totalScore = 0;

    public void fullAnswer(Pair answerC, String correctAnswer){
        if(answerC.getAnswer().equals(correctAnswer))
            completeAnswer.put("Find the thousand digit of 45072.", answerC);
        else
            System.out.println("Wrong answer.");
    }

    public void generateQuiz(){
        questions.put("Type the following roman numbers in arabic digits: LXII, CLXV, CLXIII, XXXIII and CCCLXXXVII", Arrays.asList(new Pair("62, 163, 63, 25, 300", false), 
                                                                                                                                    new Pair("41, 165, 163, 33, 300", false),
                                                                                                                                    new Pair("62, 165, 163, 33, 387", true),
                                                                                                                                    new Pair("63, 50, 163, 35, 1554", false)));
        
        questions.put("What is the smallest 4-digit natural number for which the digit sum is equal to the product of its digits?", Arrays.asList(new Pair("2134", false),
                                                                                                                                                  new Pair("1124", true),
                                                                                                                                                  new Pair("1421", false),
                                                                                                                                                  new Pair("1685", false)));

        questions.put("How many 2-digit natural numbers can be written using only even digits?", Arrays.asList(new Pair("45", true),
                                                                                                               new Pair("55", false),
                                                                                                               new Pair("60", false),
                                                                                                               new Pair("100", false)));

        questions.put("Write all the 4-digit numbers using just the digits '0' and '3'. Find their sum afterwards.", Arrays.asList(new Pair("20000", false),
                                                                                                                                   new Pair("2505", false),
                                                                                                                                   new Pair("45000", false),
                                                                                                                                   new Pair("25332", true)));

    }
}