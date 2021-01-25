package com.algo_ds.algorithms_datastructures1.tress_graphs;

    class Trees_Graphs_102_BInarySearchTree {
        // Returns index of x if it is present in arr[],
        // else return -1
        int binarySearch(int arr[], int x)
        {
            int left = 0, r = arr.length - 1;
            while (left <= r) {
                int m = left + (r - left) / 2;         //https://www.quora.com/What-is-the-difference-between-and-in-Java-5
                // Check if x is present at mid
                if (arr[m] == x)
                    return m;

                // If x greater, ignore left half
                if (arr[m] < x)
                    left = m + 1;

                    // If x is smaller, ignore right half
                else
                    r = m - 1;
            }

            // if we reach here, then element was
            // not present
            return -1;
        }

        // Driver method to test above
        public static void main(String args[])
        {
            Trees_Graphs_102_BInarySearchTree ob = new Trees_Graphs_102_BInarySearchTree();
            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 10;
            int result = ob.binarySearch(arr, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at "
                        + "index " + result);
        }
    }
