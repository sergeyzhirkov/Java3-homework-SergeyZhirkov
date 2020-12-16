package ru.zhirkov.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        castling(arr, 1,2);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void castling(T[] array, int index1, int index2) {
        T elem = array[index1];
        array[index1] = array[index2];
        array[index2] = elem;
    }
}


