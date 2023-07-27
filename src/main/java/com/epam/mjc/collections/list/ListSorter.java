package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);

        if (Math.abs(aValue) == Math.abs(bValue)) {
            return Integer.compare(aValue, bValue);
        }
        return Integer.compare(Math.abs(aValue), Math.abs(bValue));
    }
}
