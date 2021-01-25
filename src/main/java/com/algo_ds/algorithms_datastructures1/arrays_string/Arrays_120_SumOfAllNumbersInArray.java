package com.algo_ds.algorithms_datastructures1.arrays_string;

public class Arrays_120_SumOfAllNumbersInArray {

    public static void main(String[] args) {
        int[] array1 = {3,0,1};
        sumofAllNumbersInTheArray(array1);
    }

       private static void sumofAllNumbersInTheArray(int[] array1) {

       int n = array1.length+1;
        int sum  = (n * (n-1))/2;
        System.out.println(sum);

      for(int i=0;i<array1.length;i++){
          sum=sum-array1[i];
      }

        System.out.println("finalSum:"+sum);
    }


}