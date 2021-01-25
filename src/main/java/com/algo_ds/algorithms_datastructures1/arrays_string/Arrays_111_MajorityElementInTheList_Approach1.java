package com.algo_ds.algorithms_datastructures1.arrays_string;


public class Arrays_111_MajorityElementInTheList_Approach1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1,1};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;

        //forEachloop
     /* for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }
        return -1;*/

     //forloop
     for (int i = 0; i < nums.length; i++) {
      int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count = count + 1;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }

        }
        return -1;


    }
}


