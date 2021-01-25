package com.algo_ds.algorithms_datastructures1.arrays_string;


//find pivot and then appply binary search on it
public class Arrays_115_nextGretestElementIntheArray_Approach1 {
    // main function
    public static void main(String args[]) {
        // Let us search 3 in below array
        int array[] = {98,23,54,12,20,7,27};
       // int array[] = {};
        int n = array.length;
        int key=23;
        System.out.println(nextGretestElement(array, n, 23));
    }

    private static Integer nextGretestElement(int[] array, int n, int key) {

        if(array.length==0 || array==null){
            return null;
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[i]){
                    if(array[i]==key){
                        return array[j];
                    }
                }
            }
        }
        return -1;
    }
}


