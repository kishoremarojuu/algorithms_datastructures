package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_124_ElementThatAppearsOnceInTheArray {
        // driver program
        public static void main (String[] args)
        {
            int[] a = {4,4,4,9,9,8};
            elementOnceInTheArray(a);
        }
    private static void elementOnceInTheArray(int[] a) {
            int[] index = new int[a.length+1];
            for(int i=0;i<=a.length;i++){
                index[i]=-1;
            }
            for(int i=0;i<a.length;i++){
                if((index[a[i]])==-1){
                index[a[i]]=1;
                }else{
                    index[a[i]]=-2;
                }
            }
            for(int i=0;i<=index.length;i++){
                if(index[i]==1){
                    System.out.println(a[index[i]]);
                }
            }
    }
}
