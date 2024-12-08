package com.mathapp.UsefulCode;

enum difficulty{
    Easy,
    Medium,
    Hard,
    Legendary
}

public class Exercise{
    private int id;
    private String question;
    private difficulty level;
    private String answer;
    private String solution;

    public Exercise()   {}
    public Exercise(int i, String q, difficulty l, String a, String s){
        this.id = i;
        this.question = q;
        this.level = l;
        this.answer = a;
        this.solution = s;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int other){
        this.id = other;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setQuestion(String other){
        this.question = other;
    }

    public difficulty getLevel(){
        return this.level;
    }

    public void setLevel(difficulty other){
        this.level = other;
    }

    public String getAnswer(){
        return this.answer;
    }

    public void setAnswer(String other){
        this.answer = other;
    }

    public String getSolution(){
        return this.solution;
    }

    public void setSolution(String other){
        this.solution = other;
    }

    public boolean checkAnswer(){
        return this.answer.equals(this.solution);   
    }

    public String toString(){
        return "Exercise:\nexercise_ID = " + this.id + "\nexercise_question = " + this.question +
        "\nlevel = " + this.level + "\nanswer_given = " + this.answer + "\nstandard_solution = " + this.solution;
    }
}