package com.algo_ds.algorithms_datastructures1.arrays_string;

public class String_100_stringIsUniqueOrNot {

    public static void main(String[] args) {
        String_100_stringIsUniqueOrNot m1= new String_100_stringIsUniqueOrNot();
        String input = "amazon";
        if (m1.someMethod(input)) {
            System.out.println("this is good");
        } else {
            System.err.println("this is not good");
        }
    }

    boolean someMethod(String str) {

        int max_length = 128;
        if (str.length() > max_length) {
            return false;
        }
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);  //97

            if (char_set[val] == true) {
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }
}


