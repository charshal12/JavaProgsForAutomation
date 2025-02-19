package com.dataStructureExamples.Java8SampeCodes.Reduce;

import java.util.Arrays;

public class JoinStringsExample {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("",(a, b) -> a + "|" + b);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);

        String join1 = String.join("", strings);


        System.out.println(reduce); //|a|b|c|d|e
        System.out.println(reduce2); //a|b|c|d|e
        System.out.println(join); //a|b|c|d|e
        System.out.println(join1); //abcde
    }
}
