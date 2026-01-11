package exam_11Jan_2026;

import javax.swing.*;
import java.util.Scanner;

public class Even_Odd_number {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");

        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Entered number is Even number");

        }
        else

        {
            System.out.println("Entered number is Odd number");

        }

sc.close();
    }


    }

