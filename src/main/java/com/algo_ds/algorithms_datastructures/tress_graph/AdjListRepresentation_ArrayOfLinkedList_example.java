package com.algo_ds.algorithms_datastructures.tress_graph;

import java.util.LinkedList;

public class AdjListRepresentation_ArrayOfLinkedList_example {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.add("spring");
        list1.add("struts");

        LinkedList list2 = new LinkedList();
        list2.add("alexander");
        list2.add("Hitler");

        LinkedList list3 = new LinkedList();
        list3.add("remote");
        list3.add("TV");

        Object[] objects = {list1, list2, list3} ;

      /*  for(int i=0;i<objects.length;i++)
        {
            System.out.println(objects[i].toString());
        }*/

      for(Object p:objects){
          System.out.println(p.toString());
      }


    }
}
