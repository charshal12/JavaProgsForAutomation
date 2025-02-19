package Java8SampeCodes.FilterAndCollect;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The equivalent example in Java 8, stream.filter() to filter a List, and collect() to convert a stream into a List.
/***Collect: This is the way to get out of the streams world and obtain a concrete collection of values,
  like a list in the example above.***/

public class FilterAndCollectExample {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "nidhi");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"nidhi".equals(line))     // we dont like nidhi
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }
}
