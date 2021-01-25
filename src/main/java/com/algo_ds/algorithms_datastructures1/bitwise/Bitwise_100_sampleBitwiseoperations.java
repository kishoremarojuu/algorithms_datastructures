package com.algo_ds.algorithms_datastructures1.bitwise;

public class Bitwise_100_sampleBitwiseoperations {


    public static void main(String[] args) {

                //240  128   64   32  16  8  4  2  1
        //240  //1     0     0    0   0   0  0  0  0
        //

        int c = 240;
       /*           240  128   64   32  16   8  4  2  1
        //240       1     0     0    0   0   0  0  0  0
        //240<<2
        */
        System.out.println(c<<1);

        int d = 504;
        System.out.println(d>>2);
    }
}
