package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCounter {

    private String words;


    public WordCounter(String s) {
        this.words = s;
    }

    public int wordCount(){
        return words.split(" ").length;
    }

}
