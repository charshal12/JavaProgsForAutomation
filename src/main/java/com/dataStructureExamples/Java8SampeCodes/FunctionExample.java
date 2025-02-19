package com.dataStructureExamples.Java8SampeCodes;
import java.util.function.Function;
/*** FUNCTION
 * In Java, the Function interface is a functional interface introduced in Java 8 as part of the java.util.function package.
 * It represents a function that accepts one argument and produces a result. This interface typically transforms the input value into an output value.
 * The Function interface has one abstract method called apply, which takes an argument of a certain type and returns a result of another type.
 *
 * SYNTAX
 * @FunctionalInterface
 * public interface Function<T, R> {
 *     R apply(T t);
 * }
 * ***/
public class FunctionExample {

        public static void main(String[] args)
        {
            // Example 1: Convert String to Integer
            Function<String, Integer> stringToInteger = s -> Integer.parseInt(s);
            Integer intValue = stringToInteger.apply("123");
            System.out.println("Converted Integer: " + intValue);

            // Example 2: Convert Integer to String
            Function<Integer, String> integerToString = i -> String.valueOf(i);
            String stringValue = integerToString.apply(456);
            System.out.println("Converted String: " + stringValue);

            // Example 3: Composing functions
            Function<String, Integer> stringLength = s -> s.length();
            Function<Integer, String> addPrefix = i -> "Length is: " + i;

            // Compose functions stringToInteger and addPrefix
            Function<String, String> composedFunction = stringToInteger.andThen(addPrefix);
            String result = composedFunction.apply("Hello");
            System.out.println("Result after composing functions: " + result);
        }
}
