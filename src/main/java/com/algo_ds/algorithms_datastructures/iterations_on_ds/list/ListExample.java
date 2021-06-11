package com.algo_ds.algorithms_datastructures.iterations_on_ds.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        /* For Loop for iterating ArrayList */
        for (int counter = 0; counter < arrlist.size(); counter++) {
            //System.out.println(arrlist.get(counter));
        }

        /* Advanced For Loop*/
        for (Integer num : arrlist) {
            //System.out.println(num);
        }

        /*Looping Array List using Iterator*/
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
           // arrlist.add(20);
           System.out.println(iter.next());
        }

        //looping using java8 streams
        //arrlist.stream().forEach(System.out::println);



    }
}
