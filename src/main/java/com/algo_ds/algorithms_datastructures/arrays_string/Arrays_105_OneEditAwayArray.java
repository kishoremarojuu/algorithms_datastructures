package com.algo_ds.algorithms_datastructures.arrays_string;

public class Arrays_105_OneEditAwayArray {
    public static void main(String[] args) {
    String s1 = "pale"; String s2 ="pdale";
    System.out.println(oneEditAway(s1, s2));
}

    private static boolean oneEditAway(String first, String second) {
        if(first.length()==second.length()) {
            return oneEditReplace(first,second);
        }else if (first.length()+1==second.length()){
            return oneEditInsert(first,second);
        }else if(first.length()-1==second.length()) {
            return oneEditInsert(first, second);
        }
        return false;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false; //initially am setting one Boolean as false and if next time if two chars are not equal, I will return false
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                if(foundDifference) {
                    return false;
                }
                foundDifference= true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String s1, String s2) {
        int index1= 0; int index2= 0;
        while(index2<s2.length()&&index1<s1.length()) {
            if(s1.charAt(index1)!=s2.charAt(index2)) {
                if(index1!=index2) {
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }

}
