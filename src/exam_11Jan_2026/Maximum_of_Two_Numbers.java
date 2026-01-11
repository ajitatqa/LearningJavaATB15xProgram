package exam_11Jan_2026;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {

    public static void main(String []args){

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        int max = (a > b) ? a : b;

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
    }

