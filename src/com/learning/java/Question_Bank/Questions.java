package com.learning.java.Question_Bank;
import com.learning.*;
import com.learning.java.Bot.Conversations;
import com.learning.java.File_Handling.Answers;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

import static com.learning.java.Bot.Introduction.iris;
import static com.learning.java.Bot.Introduction.signShow;

/**
 * Created by Aditya Rajput on 4/22/2017.
 */
public class Questions {
    public static void test() throws IOException {
        Scanner sc = new Scanner(System.in);
        Answers answers = new Answers();
        double random;
        random=Math.random();
        int rand=(int)(100*random)%4;
        FileReader fileReader = new FileReader("Files/"+rand+".txt");
        BufferedReader bw = new BufferedReader(fileReader);
        String line = bw.readLine();
        int counter = 1;
        while(line != null) {
            iris();
            System.out.println("\t\t\t\t\t"+line);
            switch (counter) {
                case 1 :
                    signShow();
                    answers.setQues0(line);
                    answers.setAns0(sc.nextLine());
                    break;
                case 2:
                    signShow();
                    answers.setQues1(line);
                    answers.setAns1(sc.nextLine());
                    break;
                case 3:
                    signShow();
                    answers.setQues2(line);
                    answers.setAns2(sc.nextLine());
                    break;
                case 4:
                    answers.setQues3(line);
                    signShow();
                    answers.setAns3(sc.nextLine());
                    break;
                case 5:
                    answers.setQues4(line);
                    signShow();
                    answers.setAns4(sc.nextLine());
                    break;
            }
            line = bw.readLine();//read lines and then shift cursor to downwards
            counter++;
        }
        answers.writeAnswers(answers);
    }
}
