package com.nhclassen.powerpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bag {
    private Map<Packable, Integer> contents;
    private Integer capacity;

    public Bag(Integer capacity) {
        this.capacity = capacity;
        contents = new HashMap<>();
    }

    public int canHoldQty(Item i) {
        return capacity / i.weight();
    }

    public Integer addOne(Item i) {
        return addMultiple(i, 1);
    }

    public Integer addMultiple(Item i, int count) {
        if (capacity >= (count * i.weight())) {
            contents.merge(i, count, Integer::sum);
            capacity -= (count * i.weight());
            return capacity;
        } else {
            return -1;
        }
    }

    public List<PackedItem> getContents() {
        List<PackedItem> packedItems = new ArrayList<>();
        for (Packable key : contents.keySet()) {
            packedItems.add(new PackedItem(key.name(), contents.get(key)));
        }

        return packedItems;
    }
}

