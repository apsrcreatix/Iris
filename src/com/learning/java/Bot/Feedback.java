package com.learning.java.Bot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Aditya Rajput on 4/23/2017.
 */
public class Feedback extends Conversations{
    private String feedback;
    private String hisPaper;

    private String rating;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getHisPaper() {
        return hisPaper;
    }

    public void setHisPaper(String hisPaper) {
        this.hisPaper = hisPaper;
    }

    void feedBackGenerator() {
        try (
                FileWriter fileWriter = new FileWriter("C:\\Users\\Aditya Rajput\\IdeaProjects\\ItIsYourSurpriseTest!\\src\\com\\learning\\java\\Bot\\Feedback.txt",true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printer = new PrintWriter(bufferedWriter);
        ) {
            printer.println("--------------------------------------\n");
            printer.println("Feedback by "+reg+"\n");
            printer.println("Feedback :"+getFeedback()+"\n");
            printer.println("Rating : "+getRating()+"\n");
            printer.println("About his answerSheet :"+getHisPaper()+"\n");
            printer.println("--------------------------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
                }

    }

}
