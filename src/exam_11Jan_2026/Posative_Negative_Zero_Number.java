package exam_11Jan_2026;

import java.util.Scanner;

public class Posative_Negative_Zero_Number {

    public static void main(String []args){
Scanner sc= new Scanner (System.in);

System.out.println("Please Enter number");
int num= sc.nextInt();
        String result = (num > 0) ? "Positive Number"
                : (num < 0) ? "Negative Number"
                : "Zero";

        System.out.println("The number is: " + result);

        sc.close();


    }
}
