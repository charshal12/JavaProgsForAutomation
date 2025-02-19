package Java8SampeCodes.FilterFindAnyORElse;
import java.util.Arrays;
import java.util.List;
// The equivalent example in Java 8, use stream.filter() to filter a List, and .findAny().orElse (null) to return an object conditional.

public class FilterFindAnyOrElseExample {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("nidhi", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result1 = persons.stream()                        // Convert to stream
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

    }
}
