package com.mathapp.UsefulCode;

public class Lesson{
    private int id;
    private String title;
    private String theoryContent;
    private String videoURL;

    public Lesson() {}
    public Lesson(int id, String title, String theory, String url){
        this.id = id;
        this.title = title;
        this.theoryContent = theory;
        this.videoURL = url;
    }

    public int getLessonID(){
        return this.id;
    }

    public void setLessonID(int other){
        this.id = other;
    }

    public String getLessonTitle(){
        return this.title;
    }

    public void setLessonTitle(String other){
        this.title = other;
    }

    public String getTheoryContent(){
        return this.theoryContent;
    }

    public void setTheoryContent(String other){
        this.theoryContent = other;
    }

    public String getVideoURL(){
        return this.videoURL;
    }

    public void setVideoURL(String other){
        this.videoURL = other;
    }

    public void displayTheory(){
        System.out.println(this.theoryContent);
    }
}