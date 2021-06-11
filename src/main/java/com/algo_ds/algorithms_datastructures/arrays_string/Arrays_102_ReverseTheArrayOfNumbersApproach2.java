package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_102_ReverseTheArrayOfNumbersApproach2 {

        public static void main(String[] args) {

            int[] numbers = { 5, 6, 7, 2, 1, 8 };
            reverseTheNumbersUsingTemp(numbers);

           /* String[] names = { "Kishore", "Divya", "Roja", "Ashoka" };
            reverseTheNamesUsingTemp(names);
*/
        }

        private static void reverseTheNumbersUsingTemp(int[] numbers) {
            System.out.println("numbers.length: " + numbers.length); // numbers.length:6

            for (int i = 0; i<numbers.length / 2; i++) {
                int temp = numbers[i]; // temp= 5
                numbers[i] = numbers[numbers.length - i - 1]; // numbers[0]= 8
                numbers[numbers.length - i - 1] = temp; // numbers[5] = 5

            }
            for (int j = 0; j<numbers.length; j++) {
                System.out.println(numbers[j]);
            }

        }

        private static void reverseTheNamesUsingTemp(String[] names) {
            System.out.println("names.length: " + names.length);

            for (int i = 0; i<names.length / 2; i++) {
                String temp = names[i];
                names[i] = names[names.length - i - 1];
                names[names.length - i - 1] = temp;

            }
            for (int j = 0; j<names.length; j++) {
                System.out.println(names[j]);
            }

        }


    }
