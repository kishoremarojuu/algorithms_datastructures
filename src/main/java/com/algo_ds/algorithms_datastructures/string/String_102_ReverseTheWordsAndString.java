package com.algo_ds.algorithms_datastructures.string;

/*
input: Apple is best fruit
output: tiurf tseb si elppA
 */

public class String_102_ReverseTheWordsAndString {
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

            StringBuilder ft= new StringBuilder();
            for(int k=split[i].length()-1; k>=0; k--){   //apple,
                 ft.append(split[i].charAt(k));
            }


          output = output+ " "+ ft;






        }
        return output;

    }



}