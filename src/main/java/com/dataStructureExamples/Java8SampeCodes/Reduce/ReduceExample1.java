package com.dataStructureExamples.Java8SampeCodes.Reduce;

import java.util.Arrays;

public class ReduceExample1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Stream.reduce()
        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        //OR  method reference with Integer::sum
        //int sum = Arrays.stream(numbers).reduce(0, Integer::sum); // 55

        System.out.println("sum : " + sum); // 55
    }
}
