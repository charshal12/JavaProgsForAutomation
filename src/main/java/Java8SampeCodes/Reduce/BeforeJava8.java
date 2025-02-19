package Java8SampeCodes.Reduce;

public class BeforeJava8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("sum : " + sum);
    }
}
