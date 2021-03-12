package ru.zhirkov.task3;

import ru.zhirkov.task3.fruits.Apple;
import ru.zhirkov.task3.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());

        System.out.println(appleBox.compare(orangeBox));

        orangeBox.add(new Orange());

        System.out.println(orangeBox.compare(appleBox));

        Box<Apple> secondAppleBox = new Box<>(new Apple());

        System.out.println(appleBox.getWeight() + " " + secondAppleBox.getWeight());
        appleBox.transfer(secondAppleBox);
        System.out.println(appleBox.getWeight() + " " + secondAppleBox.getWeight());


    }
}
