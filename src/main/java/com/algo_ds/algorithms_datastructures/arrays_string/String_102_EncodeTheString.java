package com.algo_ds.algorithms_datastructures.arrays_string;

/*problem statement
 give the input String aabbbcddddd
 output: 2a3b1c5d
 */

public class String_102_EncodeTheString {

    public static void main(String[] args) {
        String input = "aabbbcddddd";
        //String input = "kishore";
        String result = encodeTheString(input);
        System.out.println("result:" + result);
    }

    static String encodeTheString(String input) {
        if(null==input && input.length()==0){
            return "";
        }
        char previousChar = 0;
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();
        previousChar = charArray[0];

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == previousChar) {
                //previousChar= ch;
                counter++;
            } else {
                stringBuilder.append(counter).append(previousChar);
                previousChar = charArray[i];
                counter = 1;
            }
        }
        stringBuilder.append(counter).append(previousChar);
        return stringBuilder.toString();
    }
}
