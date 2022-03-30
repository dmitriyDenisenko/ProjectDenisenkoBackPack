package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Backpack {
    Item[] items;
    int price;

    public Backpack(Item[] items, int price) {
        this.items = items;
        this.price = price;
    }

    public Item[] getItems() {
        return items;
    }

    public int getPrice() {
        return price;
    }

    //Описание состояния рюкзака
    public String getDescription() {
        return items == null ? "" : Arrays.stream(items).map(Item::getName).collect(Collectors.joining("+")) + "-" + getPrice();
    }
}

