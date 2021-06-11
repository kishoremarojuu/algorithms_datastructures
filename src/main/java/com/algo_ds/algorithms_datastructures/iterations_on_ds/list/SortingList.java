package com.algo_ds.algorithms_datastructures.iterations_on_ds.list;

import java.util.ArrayList;

public class SortingList {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        //looping using java8 streams
        arrlist.stream()
                .sorted()
                .forEach(System.out::println);



    }
}
