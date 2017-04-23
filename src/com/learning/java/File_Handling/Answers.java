package com.learning.java.File_Handling;

import com.learning.java.Bot.Conversations;
import com.learning.java.Bot.Element;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Aditya Rajput on 4/21/2017.
 */
public class Answers extends Conversations implements Element {

    private String regNumber;
    private String ques0,ques1,ques2,ques3,ques4;
    private String ans0,ans1,ans2,ans3,ans4;
    public Answers(){}
    public Answers(String reg){
        regNumber=reg;
    }


    public String getQues0() {
        return ques0;
    }

    public void setQues0(String ques0) {
        this.ques0 = ques0;
    }

    public String getQues1() {
        return ques1;
    }

    public void setQues1(String ques1) {
        this.ques1 = ques1;
    }

    public String getQues2() {
        return ques2;
    }

    public void setQues2(String ques2) {
        this.ques2 = ques2;
    }

    public String getQues3() {
        return ques3;
    }

    public void setQues3(String ques3) {
        this.ques3 = ques3;
    }

    public String getQues4() {
        return ques4;
    }

    public void setQues4(String ques4) {
        this.ques4 = ques4;
    }

    public String getAns0() {
        return ans0;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns0(String ans0) {
        this.ans0 = ans0;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }


    public void writeAnswers(Answers answers) throws IOException {

        try (   FileWriter fw = new FileWriter("Test_Sheets/"+reg+".txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {

            out.println();

            out.println("Question : " + answers.getQues0());
            out.println("Answer : " + answers.getAns0());

            out.println("Question : " + answers.getQues1());
            out.println("Answer : " + answers.getAns1());

            out.println("Question : " + answers.getQues2());
            out.println("Answer : " + answers.getAns2());

            out.println("Question : " + answers.getQues3());
            out.println("Answer : " + answers.getAns3());

            out.println("Question : " + answers.getQues4());
            out.println("Answer : " + answers.getAns4());

        }
    }

    }




