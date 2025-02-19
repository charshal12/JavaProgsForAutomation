package Java8SampeCodes.FilterAndCollect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "nidhi");
        List<String> result = getFilterOutput(lines, "nidhi");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"nidhi".equals(line)) { // we dont like nidhi
                result.add(line);
            }
        }
        return result;
    }
}
