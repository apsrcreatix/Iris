package com.learning.java;

import com.learning.java.Bot.Conversations;
import com.learning.java.Bot.Introduction;
import com.learning.java.File_Handling.Answers;
import com.learning.java.Question_Bank.Questions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        	// write your code here
        Introduction introduction = new Introduction();
        Conversations conversations=new Conversations();
        introduction.wishes();
        introduction.intro();

        try {
            conversations.firstConversation();
        } catch (IOException e) {
            e.printStackTrace();
        }
        conversations.instructions();
        conversations.testConversation();
        conversations.afterConversation();
    }
}
