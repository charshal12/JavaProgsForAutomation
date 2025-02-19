package Java8SampeCodes;
import java.util.function.Supplier;
/***
 * In Java, the Supplier functional interface is part of the java.util.function package introduced in Java 8.
 * It represents a supplier of results. It doesn’t take any argument but produces a result of a given type.
 * The Supplier interface has one abstract method called get, which doesn’t take any arguments but returns a result of the specified type.
 *
 * Syntax
 * @FunctionalInterface
 * public interface Supplier<T> {
 *     T get();
 * }
 * ***/
public class SupplierExample {
    public static void main(String[] args) {
        // Example 1: Supplier for generating random numbers
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number: " + randomSupplier.get());

        // Example 2: Supplier for generating current timestamp
        Supplier<Long> currentTimeSupplier = System::currentTimeMillis;
        System.out.println("Current timestamp: " + currentTimeSupplier.get());

        // Example 3: Supplier for providing a constant value
        Supplier<String> greetingSupplier = () -> "Hello, world!";
        System.out.println("Greeting: " + greetingSupplier.get());
    }
}
