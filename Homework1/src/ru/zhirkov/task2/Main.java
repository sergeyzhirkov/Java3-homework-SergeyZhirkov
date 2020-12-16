package ru.zhirkov.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "four"};
        ArrayList<String> arrayList = toArrayList(arr);
        System.out.println(arrayList);
    }

    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
