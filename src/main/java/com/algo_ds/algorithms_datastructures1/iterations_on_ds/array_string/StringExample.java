package com.algo_ds.algorithms_datastructures1.iterations_on_ds.array_string;

public class StringExample {
    public static void main(String[] args) {

        //differences between forloop and forEachloop
        int[] arr = {5,4,8,6,2,4,5,9,7};
        System.out.println("iterating arrau using forLoop");

        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }

        System.out.println("iterating array using forEachLoop");
        for( int key:arr) {
            //  System.out.println(key);
        }
        System.out.println("iterating array using while Loop"); //whileLoop is complicated with array
        int k=0;
        while(k<arr.length){
            System.out.print(arr[k]);
            k=k+1;
        }

    }
}
