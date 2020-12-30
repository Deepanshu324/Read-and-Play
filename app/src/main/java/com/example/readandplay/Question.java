package com.example.readandplay;

public class Question {

    public String questions[]={
            "Birbal was Emperor Akbar's:",
            "Emperor Akbar asked the number of which animal in the city ?",
            "Whom did the Selfish Fox invited for the dinner ?",
            "The fox served the dinner to the stork in which of these utensils ?",
            "The rich and greedy man was fond of which of these things:",
            "Whose hair was caught in the branches of the tree ?",

    };
    public String[][] choices={
            {"Enemy","Father","Courtier","Brother"},
            {"Cow","Crow","Duck","Deer"},
            {"Stork","Bull","Lion","Cat"},
            {"Narrow Vessel","Jug","Spoon","Shallow Bowl"},
            {"Pearl","Gold","Cars","Lavish Clothes"},
            {"Daughter","Akbar","Fairy","Fox"}
    };
    public String correctAnswer[]={
            "Courtier","Crow","Stork","Shallow Bowl","Gold","Fairy"
    };
    public String getQuestion (int a){
        String question=questions[a];
        return question;
    }
    public String getchoice1 (int a){
        String choice=choices[a][2];
        return choice;
    }
    public String getchoice2 (int a){
        String choice=choices[a][1];
        return choice;
    }
    public String getchoice3 (int a){
        String choice=choices[a][0];
        return choice;
    }
    public String getchoice4 (int a){
        String choice=choices[a][3];
        return choice;
    }
    public String getchoice5 (int a){
        String choice=choices[a][1];
        return choice;
    }
    public String getchoice6 (int a){
        String choice=choices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a) {

        String answer = correctAnswer[a];

        return answer;
    }



}
