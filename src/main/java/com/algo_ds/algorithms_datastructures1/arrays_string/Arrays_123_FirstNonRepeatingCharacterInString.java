package com.algo_ds.algorithms_datastructures1.arrays_string;

public class Arrays_123_FirstNonRepeatingCharacterInString {
    public static Character getFirstNonRepeatingCharacterLinearOptimized(String string) {
        if(string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        if(n == 1) {
            return string.charAt(0);
        }

        int[] charIdx = new int[256];   // Index of non repeating characters. If repeating, then index = -2
        // Initialize character index of all characters to -1
        for(int i = 0; i < 256; i++) {
            charIdx[i] = -1;
        }

        for(int i = 0; i < n; i++) {
            if(charIdx[string.charAt(i)] == -1) {
                // character seen first time
                charIdx[string.charAt(i)] = i;
            } else {
                // Repeated character
                charIdx[string.charAt(i)] = -2;
            }
        }

        int minIdx = n; // Index of first non repeating character
        for(int i = 0; i < 256; i++) {
            if(charIdx[i] >= 0 && minIdx > charIdx[i]) {
                minIdx = charIdx[i];
                // break;
            }
        }
        return string.charAt(minIdx);
        //return (minIdx >= 0 && minIdx < n) ? string.charAt(minIdx) : null;     //original is this, I added above line and line noO: 34 as well to ease
    }

    //second approach - not efficient
    public static Character getFirstNonRepeatingCharacterLinear(String string) {
        if(string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        if(n == 1) {
            return string.charAt(0);
        }

        int[] charCounts = new int[256];
        // Initialize character counts of all characters to 0
        for(int i = 0; i < 256; i++) {
            charCounts[i] = 0;
        }

        for(int i = 0; i < n; i++) {
            charCounts[string.charAt(i)]++;
        }

        for(int i = 0; i < n; i++) {
            if(charCounts[string.charAt(i)] == 1) {
                return string.charAt(i);
            }
        }
        return null;
    }

    //approach-3 naive method
    public static Character getFirstNonRepeatingCharacterNaive(String string) {
        if(string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        for(int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j = 0; j < n; j++) {
                if(i != j && string.charAt(i) == string.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return string.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //   String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        String string = "ABABHK";
        //   System.out.println("Output: " + getFirstNonRepeatingCharacterNaive(string));
        System.out.println("Output: " + getFirstNonRepeatingCharacterLinearOptimized(string));
    }
}
