package com.algo_ds.algorithms_datastructures1.arrays_string;

public class String_100_ReverseTheWordsInString {
    public static void main(String args[] ) throws Exception {
        String input = "Wherever you go you can always find beauty";
        System.out.println(reversetheWordsInString(input));
    }

    public static String reversetheWordsInString(String str){
        int n = str.length();
        String[] split = str.split(" ");

        String output = "";
        for(int i=split.length-1;i>=0; i--){
            //System.out.println(split[i]);
          output = output+ " "+ split[i];


        }
        return output;

    }



}