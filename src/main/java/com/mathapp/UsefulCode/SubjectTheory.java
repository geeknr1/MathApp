package com.mathapp.UsefulCode;

enum subjects{
    Algebra,
    Geometry,
    Mathematical_Analisys;
}

public class SubjectTheory{
    private int subjectID;
    private subjects subject;
    private String subjectTitle;
    private String subjectDescription;

    public SubjectTheory()  {}
    public SubjectTheory(int id, subjects sub, String title, String description){
        this.subjectID = id;
        this.subject = sub;
        this.subjectTitle = title;
        this.subjectDescription = description;
    }

    public int getSubjectID(){
        return this.subjectID;
    }

    public void setSubjectID(int other){
        this.subjectID = other;
    }

    public subjects getSubject(){
        return this.subject;
    }

    public void setSubject(subjects other){
        this.subject = other;
    }

    public String getSubjectTitle(){
        return this.subjectTitle;
    }

    public void setSubjectTitle(String other){
        this.subjectTitle = other;
    }

    public String getSubjectDescription(){
        return this.subjectDescription;
    }

    public void setSubjectDescription(String other){
        this.subjectDescription = other;
    }

}