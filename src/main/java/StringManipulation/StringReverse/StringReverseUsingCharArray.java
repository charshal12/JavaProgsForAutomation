package StringManipulation.StringReverse;

import java.util.Scanner;

public class StringReverseUsingCharArray {

    public static void main(String[] args) {

        System.out.print("Enter the string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        System.out.println("Input String is: "+stringInput);

        char[] stringArr = stringInput.toCharArray();
        for (int i = stringArr.length-1; i >=0 ; i--) {
            System.out.print(stringArr[i]);
        }
    }
}
