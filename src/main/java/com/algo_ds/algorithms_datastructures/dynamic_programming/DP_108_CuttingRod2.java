package com.algo_ds.algorithms_datastructures.dynamic_programming;


/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/
 */
public class DP_108_CuttingRod2 {


    public int maxValue(int[] price){
        int[] max = new int[price.length+1];
        for(int i=1; i <= price.length; i++){
            for(int j=i; j <= price.length; j++){
                max[j] = Math.max(max[j], max[j-i] + price[i-1]);
            }
        }
        return max[price.length];
    }

    public static void main(String[] args) {
        DP_108_CuttingRod2 cr = new DP_108_CuttingRod2();
        int[] price = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        long t1 = System.currentTimeMillis();
        int r = cr.maxValue(price);
        long t2 = System.currentTimeMillis();
        System.out.println(r);
        System.out.println(t2 - t1);
    }
}
