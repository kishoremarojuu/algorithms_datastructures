package com.algo_ds.algorithms_datastructures1.arrays_strings;

public class Arrays_122_ShortestRangeinKsortedLists {


        static final int N = 5;

        // array for storing the current index of list i
        static int ptr[] = new int[501];

        // This function takes an k sorted lists in the form of
        // 2D array as an argument. It finds out smallest range
        // that includes elements from each of the k lists.
        static void findSmallestRange(int arr[][], int n, int k)
        {
            int i, minval, maxval, minrange, minel = 0, maxel = 0, flag, minind;

            // initializing to 0 index;
            for (i = 0; i <= k; i++) {
                ptr[i] = 0;
            }

            minrange = Integer.MAX_VALUE;

            while (true) {
                // for mainting the index of list containing the minimum element
                minind = -1;
                minval = Integer.MAX_VALUE;
                maxval = Integer.MIN_VALUE;
                flag = 0;

                // iterating over all the list
                for (i = 0; i < k; i++) {
                    // if every element of list[i] is traversed then break the loop
                    if (ptr[i] == n) {
                        flag = 1;
                        break;
                    }
                    // find minimum value among all the list elements pointing by the ptr[] array
                    if (ptr[i] < n && arr[i][ptr[i]] < minval) {
                        minind = i; // update the index of the list
                        minval = arr[i][ptr[i]];
                    }
                    // find maximum value among all the list elements pointing by the ptr[] array
                    if (ptr[i] < n && arr[i][ptr[i]] > maxval) {
                        maxval = arr[i][ptr[i]];
                    }
                }

                // if any list exhaust we will not get any better answer, so break the while loop
                if (flag == 1) {
                    break;
                }

                ptr[minind]++;

                // updating the minrange
                if ((maxval - minval) < minrange) {
                    minel = minval;
                    maxel = maxval;
                    minrange = maxel - minel;
                }
            }
            System.out.printf("The smallest range is [%d, %d]\n", minel, maxel);
        }

        // Driver program to test above function
        public static void main(String[] args)
        {

            int arr[][] = {
                    { 4, 7, 9, 12, 15 },
                    { 0, 8, 10, 14, 20 },
                    { 6, 12, 16, 30, 50 }
            };

            int k = arr.length;

            findSmallestRange(arr, N, k);
        }
    }
// this code contributed by Rajput-Ji

