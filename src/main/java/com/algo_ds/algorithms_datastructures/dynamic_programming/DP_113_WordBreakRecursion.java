package com.algo_ds.algorithms_datastructures.dynamic_programming;


import java.util.Arrays;
import java.util.List;

class DP_113_WordBreakRecursion {
    // Function to segment given String into a space-separated
    // sequence of one or more dictionary words

    public static void wordBreak(List<String> dict, String str, String out) {
        // if we have reached the end of the String,
        // print the output String

        if (str.length() == 0) {
            System.out.println(out);
            return;
        }

        for (int i = 1; i <= str.length(); i++) {
            // consider all prefixes of current String4 = "Word"
            String prefix = str.substring(0, i);

            // if the prefix is present in the dictionary, add prefix to the
            // output String and recur for remaining String

            if (dict.contains(prefix)) {
                wordBreak(dict, str.substring(i), out + " " + prefix);
            }
        }
    }

    // main function
    public static void main(String[] args) {
        // List of Strings to represent dictionary
        List<String> dict = Arrays.asList("this", "th", "is", "famous",
                "Word", "break", "b", "r", "e", "a", "k",
                "br", "bre", "brea", "ak", "problem");

        // input String
        String str = "Wordbreakproblem";

        wordBreak(dict, str, "");
    }
}