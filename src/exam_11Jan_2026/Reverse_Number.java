package exam_11Jan_2026;

import java.util.Scanner;

public class Reverse_Number {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int reversed = 0;

            do {
                int digit = num % 10;   // get last digit
                reversed = reversed * 10 + digit;
                num = num / 10;         // remove last digit
            } while (num != 0);

            System.out.println("Reversed number: " + reversed);
            sc.close();
        }
    }


