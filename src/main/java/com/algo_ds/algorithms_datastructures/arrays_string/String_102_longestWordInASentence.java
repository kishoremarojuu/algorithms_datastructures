package com.algo_ds.algorithms_datastructures.arrays_string;

import java.util.HashMap;
import java.util.Map;

public class String_102_longestWordInASentence {
    public static void main(String[] args) {
        String input = "Enter a sentence";
        Map<String, Integer> stringIntegerMap = processTheString(input);

        System.out.println(stringIntegerMap);
    }

    private static Map<String, Integer> processTheString(String input) {

        String[] words = input.split(" ");
        int max;
        String res = "";

        Map<String, Integer> resultString = new HashMap<>();



        res= words[0];
        max = words[0].length();

        for (int i = 0; i <words.length-1; i++) {
            if (words[i].length() <=words[i + 1].length()) {
                res = words[i+1];
                max = res.length();

            }


        }
        resultString.put(res, max);

        return resultString;
    }

}
