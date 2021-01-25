package com.algo_ds.algorithms_datastructures1.arrays_string;

public class String_101_compressedString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //String s = "aaabbccccdaaaaaa";
        String s = "abcde";
        System.out.println(s.length());
        System.out.println(compressedString(s));

    }

    private static String compressedString(String s) {
        String compressedString = "";
        int count =0;
        for(int i=0;i<s.length();i++) {
            count++;
            if(i+1>=s.length()||s.charAt(i)!=s.charAt(i+1)) {
                compressedString = compressedString+s.charAt(i)+count;
                count=0;
            }
        }
        return compressedString.length()<s.length() ? compressedString : s;
    }

}
