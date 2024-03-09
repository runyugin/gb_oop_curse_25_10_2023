package org.example;

import java.util.ArrayList;

public class LongWord {
    private String words;
    public LongWord(String s) {
        this.words = s;
    }

    public ArrayList<String> longWord(){

        int longWord = 0;

        ArrayList<String> result = new ArrayList<>();

        String[] arrString = words.split(" ");

        for (int i = 0; i < arrString.length; i++) {

            if(arrString[i].length()>longWord)
                longWord = words.split(" ")[i].length();
        }


        for (int i = 0; i < arrString.length; i++) {

            if(arrString[i].length()==longWord && !(result.contains(words.split(" ")[i])))
                result.add(words.split(" ")[i]);
        }
        return result;
    }



}
