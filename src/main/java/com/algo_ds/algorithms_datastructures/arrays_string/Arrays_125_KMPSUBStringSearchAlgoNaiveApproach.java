package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_125_KMPSUBStringSearchAlgoNaiveApproach {
    // driver program
    public static void main(String[] args) {
        String txt = "KPAABAABA";
        String pat = "AABA";
        search(txt, pat);
    }

    private static void search(String txt, String pat) {

        int N = txt.length();
        int M = pat.length();

        for (int i = 0; i <= N - M; i++) {

            int j;

            /* For current index i, check for pattern
              match */
            for (j = 0; j < M; j++){
                if (txt.charAt(i + j) != pat.charAt(j)){
                    break;
                }
            }

            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
                System.out.println("Pattern found at index " + i);
        }
    }

}
