package com.mathapp.grade5.Algebra.ch1Lessons;

public class Pair{
    private String answer;
    private boolean checkAnswer;

    public Pair()   {};
    public Pair(String a, boolean ca){
        this.answer = a;
        this.checkAnswer = ca;
    }

    public String getAnswer(){
        return this.answer;
    }

    public boolean getCheckedAnswer(String userAnswer){
        return this.answer.equals(userAnswer);
    }
}