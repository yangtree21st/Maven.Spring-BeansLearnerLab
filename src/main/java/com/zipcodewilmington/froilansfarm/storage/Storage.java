package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Storage<T> {
    List<T> items = new ArrayList<T>();

    public void add(T item) {
        items.add(item);
    }

    public Collection< T> getItems() {
        return items;
    }
}
