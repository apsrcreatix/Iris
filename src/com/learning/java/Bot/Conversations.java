package com.learning.java.Bot;

import com.learning.java.File_Handling.Answers;
import com.learning.java.File_Handling.Student;
import com.learning.java.Question_Bank.Questions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Aditya Rajput on 4/22/2017.
 */
public class Conversations extends Introduction {

    Student student = new Student();
    public static String reg;
    public void firstConversation() throws IOException {


        Scanner scanner = new Scanner(System.in);
        pauser1();

        System.out.println("\t\t\t\t\tWhat is your name ?");
        signShow();
        student.setName(scanner.nextLine());
        pauser0();

        iris();
        System.out.println("\t\t\t\t\tTell me your Registration number.");
        pauser0();

        System.out.println("\t\t\t\t\tPlease ensure that you are providing yours \uD83D\uDE00 ");
        signShow();
        reg=scanner.next();
        pauser0();
        student.setRegNum(reg);
        Answers answer = new Answers(reg);
        iris();
        System.out.println("\t\t\t\t\tIn which year you are now \uD83D\uDE04? ");
        signShow();
        student.setYear(scanner.next());

        iris();
        System.out.println("\t\t\t\t\tand semester \uD83D\uDE0A?");
        signShow();
        student.setSemester(scanner.next());

        iris();
        System.out.println("\t\t\t\t\tWho is your faculty ? What's her/his name?");

        student.setFacultyName(scanner.nextLine());

        System.out.println("\t\t\t\t\t \uD83D\uDE13 !");pauser0();
        signShow();
        student.setFacultyName(scanner.nextLine());


        iris();
        System.out.println("\t\t\t\t\t OK \uD83D\uDE00"); pauser0();

        System.out.println("\t\t\t\t\tMy name is Iris \uD83D\uDE00"); pauser0();
        System.out.println("\t\t\t\t\tI will take your test as per your faculty explained me ! \uD83D\uDE0C");pauser1();

        student.writeConvoy(student);

    }



    public void instructions(){
        String userAnswers;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\t Do you need instructions for the test? \uD83D\uDE0A??");
        signShow();
        userAnswers=scanner.nextLine();

        if((userAnswers.startsWith("yes"))||(userAnswers=="yes")||(userAnswers=="Yes")||(userAnswers=="yes i do")||(userAnswers=="yes i need")){
            iris();
            System.out.println("\t\t\t\t\t\uD83D\uDC4D");pauser1();
            System.out.println("\t\t\t\t\tI will ask you 5 questions each carries 2 marks" +
                    "\n\t\t\t\t\tand you are going to answer it" +
                    "\n\t\t\t\t\tas soon as possible \uD83D\uDE0E");
            pauser0();
            System.out.println("\t\t\t\t\tWrite good answers and" +
                    "\n\t\t\t\t\ttry to write it in short but" +
                    "\n\t\t\t\t\tintelligible." +
                    "\n\t\t\t\t\tAll the best !\uD83D\uDE07 ");
        }else{
            iris();
            System.out.println("\t\t\t\t\t\uD83D\uDE15 ok.");
            pauser1();
            System.out.println("\t\t\t\t\tWrite good answers " +
                    "\n\t\t\t\t\tand try to write it in short but intelligible." +
                    "\n\t\t\t\t\tAll the best !\uD83D\uDE07 ");

        }
    }

    public void testConversation(){
        String userAnswer = new String();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t\t\tShall i start ?");
        signShow();
            userAnswer = scanner.nextLine();
        if((userAnswer.startsWith("yes"))||(userAnswer=="yeah")||(userAnswer=="Yes")||(userAnswer=="yes i do")||(userAnswer=="yes i need")||(userAnswer=="yes i want")) {
            iris();
            System.out.println("\t\t\t\t\tOK ");
            System.out.println("\t\t\t\t\tGet ready for questions ");
            }else{
            iris();
            System.out.println("\t\t\t\t\tWe need to start now dear !");
            System.out.println("\t\t\t\t\tSo here we GO ! ");
        }
        counter();
        Questions questions = new Questions();
        try {
            questions.test();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void afterConversation(){
        Scanner scanner = new Scanner(System.in);
        Feedback feedback = new Feedback();

        iris();
        pauser0();
        System.out.println("\t\t\t\t\tThis is it ! \uD83D\uDE4C");
        pauser0();
        System.out.println("\t\t\t\t\tHow was your test ?");pauser0();
        System.out.println("\t\t\t\t\tI mean ...according to you ..it was...?");pauser1();
        System.out.println("\t\t\t\t\tGreat \uD83D\uDE43 !?");pauser0();
        System.out.println("\t\t\t\t\tAverage \uD83D\uDE10!?");pauser0();
        System.out.println("\t\t\t\t\tPoor \uD83D\uDE11!?");pauser0();
        signShow();
        feedback.setHisPaper(scanner.nextLine());

        iris();
        System.out.println("\t\t\t\t\tPlease \uD83E\uDD17 tell me about your experience with me !\uD83D\uDE43");pauser1();
        System.out.print("\t\t\t\t\t\uD83D\uDE03");pauser0();
        System.out.print("\uD83D\uDE04");pauser0();
        System.out.print("\uD83D\uDE05 \n");pauser0();
        signShow();
        feedback.setFeedback(scanner.nextLine());
        pauser1();
        iris();
        System.out.println("\t\t\t\t\tHow much you are giving me between 1-5 ? \uD83D\uDE44");pauser0();
        signShow();
        feedback.setRating(scanner.next());pauser2();
        System.out.println("\t\t\t\t\tThank you ! \uD83D\uDE4F");pauser0();
        System.out.println("\t\t\t\t\t\uD83D\uDE01 Your answer will be given by" +
                "\n\t\t\t\t\tyour faculty in your classroom!");pauser0();
        System.out.println("\t\t\t\t\tI will send it to "+student.getFacultyName()+"\uD83D\uDE4F");pauser2();
        System.out.println("\t\t\t\t\tBye !\uD83D\uDE29");pauser0();
        feedback.feedBackGenerator();

    }

}
