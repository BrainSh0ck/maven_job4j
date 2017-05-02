package com.collectionstips;

import java.util.*;

/**
 * Collections detail class.
 *
 * @author Vihovsky Roman
 * @since 01.05.2017
 */
public class Collections {
    public static void main(String[] args) {
        //hashMap();
        //sortedSet();
        //cache();
        queue();

    }

    private static void treeSet() {
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);
    }

    private static void sortedSet() {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        set = set.descendingSet();
        System.out.println(set);
        Set<Integer> s = new TreeSet<>();
        for (int i = 10; i < 20; i++) {
            s.add(i);
        }
        System.out.println(s);
    }

    private static void hashMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");
        System.out.println(map);
        Map<Integer, String> m = new LinkedHashMap<>(5, 1.1f, true);
        m.put(5, "a");
        m.put(4, "b");
        m.put(3, "c");
        m.put(2, "d");
        m.put(1, "e");
        m.get(5);
        m.get(1);
        m.get(3);
        System.out.println(m);
        //may do some collision
        m.put(6, "f");
        System.out.println(m);
    }
    private static void cache() {
        cacheLRU<Integer, Integer> chache = new cacheLRU<>(2);
        chache.put(1,1);
        chache.put(2,2);
        chache.put(3,3);
        chache.get(2);
        chache.put(9,9);
        System.out.println(chache);
    }
    private static void queue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
        Queue<Integer> qp = new PriorityQueue<>();
        qp.add(5);
        qp.add(4);
        qp.add(3);
        qp.add(2);
        qp.add(1);
        while (!qp.isEmpty()) {
            System.out.println(qp.poll());
        }
    }
}
