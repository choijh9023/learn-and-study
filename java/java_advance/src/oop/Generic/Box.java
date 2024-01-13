package oop.Generic;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }

    public T getItems() {
        if (!items.isEmpty()) {
            return items.get(0);
        }
    return null;   }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

