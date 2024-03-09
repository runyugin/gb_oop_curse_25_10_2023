package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class CountFindDuplicateWords {

    private String words;

    public CountFindDuplicateWords(String s) {
        this.words = s;
    }

    public TreeMap<String,Integer> countFindWords() {

        TreeMap<String, Integer> result = new TreeMap<>();


        String[] arrString = words.split(" ");

        for (String string : arrString) {
            // если уже есть ключ, то прибавляем единицу
            if(result.keySet().contains(string.trim())) {
                result.put(string, result.get(string) + 1);
                // Если нет, то кладем ключ и присваиваем значение 1
            } else if ((string)!="" && string!=null) {
                result.put(string, 1);
            }
        }

        return result;
    }

}
