package Java8SampeCodes;

@FunctionalInterface
    interface myInterface{
        double getPiValue();
    }

    public class LambdaExpExample {
        public static void main(String[] args) {
            myInterface obj;

            obj = () -> 3.1415;
            System.out.println("Value of Pi = "+ obj.getPiValue());
        }
    }

