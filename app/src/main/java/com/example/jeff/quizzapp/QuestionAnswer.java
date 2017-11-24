package com.example.jeff.quizzapp;

/**
 * Created by Jeff on 11/23/2017.
 */

public class QuestionAnswer {

    private String question;
    private String answer;
    private Integer qImage;

    //constructors
    public QuestionAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.qImage = null;
    }

    public QuestionAnswer(String question, String answer, Integer qImage) {
        this.question = question;
        this.answer = answer;
        this.qImage = qImage;
    }


    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getqImage() {
        return qImage;
    }

    public void setqImage(Integer qImage) {
        this.qImage = qImage;
    }

}
