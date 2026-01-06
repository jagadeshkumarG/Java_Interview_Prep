package com.java.InterviewPrep.InterviewQnAs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();

        // iterator internally uses modCount

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            list.add("c");

            System.out.println("----------------------------");
        }

//		List<String> list1 = new CopyOnWriteArrayList<>();
//		list1.add("a");
//		list1.add("b");
//
//		Iterator<String> iterator1 = list.iterator();
//
//		// iterator internally uses modCount
//
//		while (iterator1.hasNext()) {
//			String element1 = iterator1.next();
//			System.out.println(element1);
//			list1.add("c");
//		}

    }

}
