package com.algo_ds.algorithms_datastructures1.arrays_strings;

import java.util.Arrays;

public class Arrays_123_KthNonRepeatingCharacterInString {
    public static Character getkthrepeatedCharacter(String string, int k) {

        if (string == null || string.length() == 0) {
            // return null;
        }

        int n = string.length();
        if (n == 1) {
            return string.charAt(0);
        }

        int[] charIdx = new int[256];
        int[] index = new int[256];
        // Index of non repeating characters. If repeating, then index = -2
        // Initialize character index of all characters to -1
        for (int i = 0; i < 256; i++) {
            charIdx[i] = -1;
            index[i] = n;
        }

        for (int i = 0; i < n; i++) {
            if (charIdx[string.charAt(i)] == -1) {
                // character seen first time
                charIdx[string.charAt(i)] = i;
                index[string.charAt(i)] = i;
            } else {
                // Repeated character
                charIdx[string.charAt(i)] = -2;
                index[string.charAt(i)] = n;
            }
        }

        Arrays.sort(index);
        if (index[k - 1] != n) {
            return string.charAt(index[k - 1]);
        }
        return null;
    }


    public static void main(String[] args) {
        //   String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        String string = "ABABHKF";
        int k =3;
        System.out.println("Output: " + getkthrepeatedCharacter(string,k));
    }
}