package com.dataStructureExamples.Java8SampeCodes;

import java.util.function.Predicate;

/*** PREDICATE
 * In Java, the Predicate functional interface is a part of the java.util.function package introduced in Java 8. It represents a predicate (boolean-valued function) of one argument. It is often used when you need to evaluate a condition on an object and return a boolean value indicating whether the condition is true or false.
 *
 * The Predicate interface defines a single method named test() which takes an argument of a specified type and returns a boolean result.
 *
 * Syntax
 * @FunctionalInterface
 * public interface Predicate<T> {
 *     boolean test(T t);
 * }
 * ***/
public class PredicateExample {
    public static void main(String[] args) {
        // Creating a Predicate to check if a given number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Testing the Predicate with some numbers
        System.out.println("Is 5 even? " + isEven.test(5));   // false
        System.out.println("Is 10 even? " + isEven.test(10)); // true


        // Creating a Predicate to check if a given number is odd
        Predicate<Integer> isOdd = num -> num % 2 == 1;

        // Testing the Predicate with some numbers
        System.out.println("Is 21 odd? " + isOdd.test(21));   // true
        System.out.println("Is 38 odd? " + isOdd.test(38)); // false
    }
}
