package com.epam.mjc.collections.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer source : sourceList) {
            if (source % 2 == 0) {
                list.addLast(source);
            } else {
                list.addFirst(source);
            }
        }

        return list;
    }
}
