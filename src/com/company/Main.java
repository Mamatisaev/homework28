package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Integer[] array = {32, 21, 10, 57, 83, 11, 98, 41, 18};

        Arrays.stream(array).filter((x)-> x % 2 == 0).map((x)-> (int)Math.pow(x,2)).max(Integer::compareTo).ifPresent(System.out::println);

    }
}
