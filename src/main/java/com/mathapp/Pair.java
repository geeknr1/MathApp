package com.mathapp;

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

    public boolean getCheckedAnswer(){
        return this.checkAnswer;
    }
}