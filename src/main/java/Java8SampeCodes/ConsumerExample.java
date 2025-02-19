package Java8SampeCodes;
import java.util.*;
import java.util.function.Consumer;

//https://www.geekster.in/articles/function-interface-in-java/
/*** CONSUMER
 * In Java, the Consumer functional interface is a part of the java.util.function package introduced in Java 8.
 * It represents an operation that accepts a single input argument and returns no result. It is meant to be used
 * in scenarios where you need to consume (or accept) some input but don’t need to produce any output.
 *
 * The Consumer interface defines a single method named accept() which takes an argument of a specified type and performs some operation on it.
 *
 * SYNTAX
 *
 * @FunctionalInterface
 * public interface Consumer<T> {
 *     void accept(T t);
 * }
 * ***/



public class ConsumerExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using a Consumer to perform an operation on each element of the list
        Consumer<Integer> consumer = (Integer num) -> {
            System.out.println("Processing number: " + num);
            // Perform any operation here
        };

        // Applying the consumer to each element of the list
        numbers.forEach(consumer);
    }
}
