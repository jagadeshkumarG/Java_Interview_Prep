package com.java.InterviewPrep.InterviewQnAs;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Vats");
        map.put(2, "Paru");

        Iterator<Integer> iterator = map.keySet().iterator();

        // iterator internally uses modCount

        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            System.out.println(key + " : " + map.get(key));
            map.put(3, "Jagha");

        }

    }

}
