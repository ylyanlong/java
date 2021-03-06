package com.yl.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by leaon on 15-9-12.
 */
public class ArrayAndLinkedListT1 {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        arrayList.set(3, 33);
        System.out.println("arrayList: " + arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("linkedList: " + linkedList);

        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "  ");
        }
        System.out.println();

        listIterator = linkedList.listIterator(linkedList.size() );
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + "  ");
        }
    }
}
