package com.company;

public class Item {
    private final String name; //название вещи
    private final int weight; //вес
    private final int price; //стоимость

    public Item(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}