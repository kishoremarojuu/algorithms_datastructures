package com.algo_ds.algorithms_datastructures1.arrays_string;

///Given an array of characters of size m, write a routine to rotate the array by n where n< m


//For example,

//Array = [a, b, c, d, e, f, g, h, i]

//m is 9

//n is 3

//Output array = [g, h, i, a, b, c, d, e, f]

public class Arrays_101_ReverseArrayByK {

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};   // [g, h, i, a, b, c, d, e, f]

        int k = 3;

        rotateTheArray(arr, k);

    }

    static void rotateTheArray(char[] a, int d) {
        char[] n = new char[a.length];


        for (int i = 0; i < a.length; i++) {

            int newLocation = (i + (a.length - d)) % a.length;
            System.out.println("newLocation:" + newLocation);
            n[i] = a[newLocation];

        }


        for (int i = 0; i < a.length; i++) {
            System.out.print(n[i] + " ");
        }


        //  o(n)

    }


}

