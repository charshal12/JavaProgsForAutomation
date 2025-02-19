package com.dataStructureExamples.Java8SampeCodes.Reduce;

import java.util.Arrays;

public class MaxNMinExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        int max1 = Arrays.stream(numbers).reduce(0, Integer :: max );

        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);
        int min1 = Arrays.stream(numbers).reduce(0, Integer :: min );

        System.out.println(max);
        System.out.println(max1);
        System.out.println(min);
        System.out.println(min1);

    }
}
