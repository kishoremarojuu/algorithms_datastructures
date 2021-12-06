package com.algo_ds.algorithms_datastructures.string;

/*input:  this is the interview
Output: weivretni eht si siht

Input: interview
Output: weivretni

*/
public class String_100_ReverseString {

    public static void main(String args[] ) throws Exception {
        System.out.println(reverseString("this is the interview"));
    }

    public static String reverseString(String str){
        int n = str.length();
        String output ="";
        for(int i=n-1;i>=0;i--){
            output = output+str.charAt(i);
        }
        return output;
    }

    public static String reverseStringUsingStringBuilder(String str){
        int n = str.length();
        StringBuilder output = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            output.append(str.charAt(i));
        }
        return output.toString();
    }

    public void revereStringSecondApproach(String input) {

        char[] charArray = input.toCharArray();
        char[] tempArray = new char[charArray.length];

        for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
            tempArray[j] = charArray[i];
        }
        String finalString = new String(tempArray);

        System.out.println(finalString);

    }

}