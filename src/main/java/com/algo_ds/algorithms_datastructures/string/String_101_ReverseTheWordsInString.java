package com.algo_ds.algorithms_datastructures.string;

/*
input: Apple is best fruit
output: fruit best is Apple
 */
public class String_101_ReverseTheWordsInString {
    public static void main(String args[] ) throws Exception {
        String input = "Apple is best fruit";
        System.out.println(reversetheWordsInString(input));
    }

    public static String reversetheWordsInString(String str){
        int n = str.length();
        String[] split = str.split(" ");

        String output = "";
        for(int i=split.length-1;i>=0; i--){   //i=3, i=2, i=1
            //System.out.println(split[i]);
          output = output+ " "+ split[i];


        }
        return output;

    }



}