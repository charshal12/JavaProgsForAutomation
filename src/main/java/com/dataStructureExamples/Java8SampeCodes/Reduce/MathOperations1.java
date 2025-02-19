package com.dataStructureExamples.Java8SampeCodes.Reduce;

import java.util.Arrays;

public class MathOperations1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum1 = Arrays.stream(numbers).reduce(0,(a,b)->a+b); //55
        int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum); //55

        int sum3 = Arrays.stream(numbers).reduce(0,(a,b) -> a-b); //-55
        int sum4 = Arrays.stream(numbers).reduce(0,(a,b) -> a*b); // 0, initial is 0, 0 * whatever = 0
        int sum5 = Arrays.stream(numbers).reduce(0,(a,b) -> a/b); //0

        int sum6 = Arrays.stream(numbers).reduce(1,(a,b) -> a*b); //3628800
        int sum7 = Arrays.stream(numbers).reduce(1,(a,b) -> a/b); //0

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);
        System.out.println(sum7);

    }
}
