package com.algo_ds.algorithms_datastructures.arrays_string;


public class Arrays_107_primeNumbers {

        public static void main(String[] args){
            boolean[] arr = new boolean[10];
            System.out.println("arr:"+arr);
            for(int i=0;i<=arr.length;i++){
                System.out.println(i);
            }

            mark_primes_sieve(arr);
            for(boolean b:arr){
                // System.out.println(b);
            }
        }

        public static void mark_primes_sieve(boolean[] numbers)
        {
            for(int i=2;i<numbers.length;i++){
                if(isPrime(i)){
                    numbers[i]=true;
                }else{
                    numbers[i]= false;
                }
            }
        }

        private static boolean isPrime(int i){
            boolean isPrime =true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }




}