package com.vertex.academy.homework2;

/**
 * Created by a on 08.02.17.
 */

import java.util.*;

public class Listener {
    public static void main(String[] args) {

        PriorityQueue<People> customerPriorityQueue = new PriorityQueue<>(getComparator());
        for (int i = 0; i < Math.random() * 100; i++) {
            customerPriorityQueue.add(new Man());
            customerPriorityQueue.add(new Woman());
        }
        while (!customerPriorityQueue.isEmpty())
            System.out.println(customerPriorityQueue.poll());
    }

    private static Comparator<People> getComparator() {
        Comparator<People> comparator = (o1, o2) -> {
            if ((o1 instanceof Man) && (o2 instanceof Man) || (o1 instanceof Woman) && (o2 instanceof Woman)) {
                if (o1.getProperties() < o2.getProperties()) {
                    return 1;
                } else if (o1.getProperties() > o2.getProperties()) {
                    return -1;
                } else return 0;
            } else if ((o1 instanceof Man) && (o2 instanceof Woman)) {
                return 1;
            } else return -1;
        };
        return comparator;
    }

}

