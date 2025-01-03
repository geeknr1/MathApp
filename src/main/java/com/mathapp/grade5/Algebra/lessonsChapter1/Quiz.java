package com.mathapp.grade5.Algebra.lessonsChapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javafx.stage.Stage;

public class Quiz{
    private static Stage primaryStage;
    private static HashMap<String, List<Pair>> mcQuiz = new HashMap<>();
    private static HashMap<String, Pair> scQuiz = new HashMap<>();
    private int questionNR = 0;
    private int totalScore = 0;

    public void fullAnswer(Pair answerC, String correctAnswer){
        if(answerC.getAnswer().equals(correctAnswer))
            completeAnswer.put("Find the thousand digit of 45072.", answerC);
        else
            System.out.println("Wrong answer.");
    }

    public void addQuizSingleChoice(String question, String correctAnswer){
        scQuiz.put(question, new Pair(correctAnswer, true));
    }

    public void addQuizMultipleChoice(String question, List<Pair> possibleAnswers){
        mcQuiz.put(question, possibleAnswers);
    }
}