package com.techelevator;

import java.util.ArrayList;

public class QuizQuestions {
    public static int getSelectAns;
    private String questions;
   private ArrayList<String> responses = new ArrayList<>();
   private static int selectAns;

    public void Question (String questionSignature) {
        String[] questionArray = questionSignature.split("\\|");
        this.questions = questionArray[0];

        for (int i = 1; i < questionArray.length; i++) {
            if (questionArray[i].endsWith("*")) {
                String fixed = questionArray[i].substring(0, questionArray.length - 1);
                if (fixed.endsWith("*")) fixed = fixed.substring(0, fixed.length() - 1);
                questionArray[i] = fixed;
                selectAns = i;
            }
            responses.add(questionArray[i]);
        }
        //return questionSignature;
    }
    public QuizQuestions(String hasNextLine) {
    }

    public String getQuestions() {
        return questions;
    }

    public ArrayList<String> getResponses() {
        return responses;
    }

    public int getSelectAns() {
        return selectAns;
    }
}
