package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        for (String source : sourceList) {
            if (++i % 3 == 0) {
                list.add(source);
                list.add(source);
            }
        }

        return list;
    }
}
