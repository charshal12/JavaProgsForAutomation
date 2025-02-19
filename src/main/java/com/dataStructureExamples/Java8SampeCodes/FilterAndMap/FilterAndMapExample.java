package com.dataStructureExamples.Java8SampeCodes.FilterAndMap;

import com.dataStructureExamples.Java8SampeCodes.FilterFindAnyORElse.Person;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/***FILTER: Returns a new stream that contains some of the elements of the original.
 It accepts the predicate to compute which elements should be returned in the new stream
 and removes the rest. In the imperative code we would employ the conditional logic
 to specify what should happen if an element satisfies the condition.
 In the functional style we don’t bother with ifs, we filter the stream
 and work only on the values we require.
 MAP: Transforms the stream elements into something else, it accepts a function to apply
 to each and every element of the stream and returns a stream of the values the parameter function
 produced. This is the bread and butter of the Java streaming API.
 Map allows you to perform a computation on the data inside a stream.
***/

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("nidhi", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        String name = persons.stream()
                .filter((x)->"jack".equals(x.getName()))
                .map(Person::getName)
                .map(String::toUpperCase)
                .findAny()
                .orElse("");
        System.out.println("Name : "+name);

        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(toList());

        collect.forEach(System.out::println);
    }
}
