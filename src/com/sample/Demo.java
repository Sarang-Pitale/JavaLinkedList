package com.sample;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(12);
        LinkedList<Integer> linkedList = new LinkedList<>(); // linked list creation
        linkedList.add(10);// add elements to linkedList
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(1, 15); // add elemant to a position
        linkedList.addAll(arrayList); // add constructor to a linked list
       // linkedList.remove();  // remove an element
        //linkedList.remove(2);
        //linkedList.removeLast();
        System.out.println(linkedList.getFirst()); // get element from head
        System.out.println(linkedList.getLast()); // get element from tail
        linkedList.addFirst(1); // add element at head
        linkedList.offer(60); // add element at tail
        linkedList.offerFirst(2);
        linkedList.offerLast(4);
        System.out.println(""+linkedList.peek()); // get the element from head
        System.out.println(linkedList);

    }
}
