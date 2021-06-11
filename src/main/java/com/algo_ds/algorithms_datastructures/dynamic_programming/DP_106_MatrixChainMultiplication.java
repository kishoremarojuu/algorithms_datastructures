package com.algo_ds.algorithms_datastructures.dynamic_programming;

    // Dynamic Programming Java implementation of Matrix
// Chain Multiplication.
// See the Cormen book for details of the following algorithm
    class DP_106_MatrixChainMultiplication
    {
        // Matrix Ai has dimension p[i-1] x p[i] for i = 1..n
        static int MatrixChainOrder(int p[], int n)
        {
		/* For simplicity of the program, one extra row and one
		extra column are allocated in m[][]. 0th row and 0th
		column of m[][] are not used */
            int m[][] = new int[n][n];

            int i, j, k, d, q;

		/* m[i,j] = Minimum number of scalar multiplications needed
		to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
		dimension of A[i] is p[i-1] x p[i] */

            // cost is zero when multiplying one matrix.
            for (i = 1; i < n; i++)
                m[i][i] = 0;

            // d is chain length.
            for (d=2; d<n; d++)
            {
                for (i=1; i<n-d+1; i++)
                {
                    j = i+d-1;
                    if(j == n) continue;
                    m[i][j] = Integer.MAX_VALUE;
                    for (k=i; k<=j-1; k++)
                    {
                        // q = cost/scalar multiplications
                        q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                        if (q < m[i][j])
                            m[i][j] = q;
                    }
                }
            }

            return m[1][n-1];
        }

        // Driver program to test above function
        public static void main(String args[])
        {
            int arr[] = new int[] {2, 3, 6, 4,5};
            int size = arr.length;

            System.out.println("Minimum number of multiplications is "+
                    MatrixChainOrder(arr, size));
        }
    }
    /* This code is contributed by Rajat Mishra*/

