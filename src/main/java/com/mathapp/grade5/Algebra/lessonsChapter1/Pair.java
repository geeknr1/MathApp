package com.mathapp.grade5.Algebra.lessonsChapter1;

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

    public boolean getCheckedAnswer(String otherAnswer){
        if(this.answer.equals(otherAnswer))
            this.checkAnswer = true;
        else
            this.checkAnswer = false;

        return this.checkAnswer;
    }
}