package StringManipulation.StringReverse;

import java.util.Scanner;

public class StringReverseUsingCharAt {

    public static void main(String[] args) {

        System.out.print("Enter the string to reverse: ");
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        System.out.println("Input String is: "+stringInput);

        String reverse = "";
        char ch;

        for (int i = 0; i <= stringInput.length() ; i++) {
            ch = stringInput.charAt(i);
            reverse = reverse + ch;
        }
        System.out.print(reverse);
    }
}
