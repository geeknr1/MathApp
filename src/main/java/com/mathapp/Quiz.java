package com.mathapp;

import java.util.HashMap;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz{
    private static Stage primaryStage;
    private HashMap<String, List<Pair>> mcQuiz = new HashMap<>();
    private HashMap<String, Pair> scQuiz = new HashMap<>();
    private int questionNR = 0;
    private int totalScore = 0;

    public void fullAnswer(Pair answerC, String correctAnswer){
        if(answerC.getAnswer().equals(correctAnswer))
            scQuiz.put("Find the thousand digit of 45072.", answerC);
        else
            System.out.println("Wrong answer.");
    }

    public void addQuizSingleChoice(String question, String correctAnswer){
        scQuiz.put(question, new Pair(correctAnswer, true));
    }

    public void addQuizMultipleChoice(String question, List<Pair> possibleAnswers){
        mcQuiz.put(question, possibleAnswers);
    }

    public VBox generateQuiz(Stage stage){
        primaryStage = stage;
        VBox root = new VBox(10);
        HashMap<String, ToggleGroup> tgQuiz = new HashMap<>();
        for(HashMap.Entry<String, List<Pair>> entry : mcQuiz.entrySet()){
            String questionText = entry.getKey();
            List<Pair> answersToQuestion = entry.getValue();
            Label questionLabel = new Label(questionText);
            root.getChildren().add(questionLabel);

            ToggleGroup tg = new ToggleGroup();

            for(Pair answer: answersToQuestion){
                RadioButton rb = new RadioButton(answer.getAnswer());
                rb.setToggleGroup(tg);
                root.getChildren().add(rb);
            }

            tgQuiz.put(questionText, tg);
        }

        HashMap<String, TextField> completeAnswerMap = new HashMap<>(); 

        for(HashMap.Entry<String, Pair> entry: scQuiz.entrySet()){
            String questionText = entry.getKey();
            Pair answerToQuestion = entry.getValue();
            Label questionLabel = new Label(questionText);
            root.getChildren().add(questionLabel);

            TextField answerField = new TextField();
            answerField.setPromptText("Add answer: ");
            root.getChildren().add(answerField);

            completeAnswerMap.put(questionText, answerField);
        }

        Label resultLabel = new Label();
        Button sendButton = new Button("Send");

        sendButton.setOnAction(event->{
            totalScore = 0;
            int avgXP = 15;
            int highXP = 30;
            questionNR = mcQuiz.size() + scQuiz.size();
            int totalMaxSCore = avgXP * mcQuiz.size() + highXP * scQuiz.size();
            for(HashMap.Entry<String, List<Pair>> entry: mcQuiz.entrySet()){
                String questionText = entry.getKey();
                List<Pair> answersToQuestion = entry.getValue();

                ToggleGroup group = tgQuiz.get(questionText);

                if(group.getSelectedToggle() != null){
                    RadioButton selectedButton = (RadioButton)group.getSelectedToggle();
                    String userAnswer = selectedButton.getText();
                    for(Pair pair: answersToQuestion){
                        if(userAnswer.equals(pair.getAnswer()) && pair.getCheckedAnswer() == true)
                            totalScore += avgXP;
                    }
                }    
            }

            for(HashMap.Entry<String, Pair> entry: scQuiz.entrySet()){
                String questionText = entry.getKey();
                Pair answerToQuestion = entry.getValue();

                TextField userAnswer = completeAnswerMap.get(questionText);
                if(userAnswer != null && userAnswer.getText().equals(answerToQuestion.getAnswer()) && answerToQuestion.getCheckedAnswer() == true){
                    totalScore += highXP;
                }
            }
            int proportionalScore = (100 * totalScore) / totalMaxSCore;
            resultLabel.setText("Total score accumulated: " + totalScore + "\nThe percentage accumulated: " + proportionalScore + "%");
        });

        root.getChildren().addAll(resultLabel, sendButton);

        return root;
    }
}