package StringManipulation.StringReverse;

import java.util.*;

public class StringReverseUsingCollection {
    public static void main(String[] args) {
        System.out.print("Enter the string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        System.out.println("Input String is: "+stringInput);


        char[] StringArr = stringInput.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char c : StringArr){
            list.add(c);
        }

//        Collections.reverse(list);
//        for (char c : list){
//            System.out.print(c);
//        }

        /*** Using Java STREAMS ***/
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);



    }


}
