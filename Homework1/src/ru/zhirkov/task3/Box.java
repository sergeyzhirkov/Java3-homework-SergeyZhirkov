package ru.zhirkov.task3;

import ru.zhirkov.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> container;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        container.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : container) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }

    public void transfer(Box<T> fromBox) {
        if (fromBox == this) {
            return;
        }
        this.container.addAll(fromBox.container);
        fromBox.container.clear();
    }
}
