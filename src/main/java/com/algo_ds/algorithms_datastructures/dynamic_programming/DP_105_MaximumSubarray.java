package com.algo_ds.algorithms_datastructures.dynamic_programming;


    // Java program to print largest contiguous array sum


class DP_105_MaximumSubarray
{
    public static void main (String[] args)
    {
        int [] a = {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int start=0; int end=0; int s=0;


        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start=s;
                end=i;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
            s=i+1;
            }

        }
        System.out.println(start);
        System.out.println(end);
        return max_so_far;
    }
}
