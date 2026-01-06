package ex_03_Switch_Program;

import java.util.Scanner;

public class Lab015_Switch {

public static void main (String [] args ){
    Scanner Scanner = new Scanner(System.in);

    System.out.println("Enter the number 1 to 7 for the day program");

    int day = Scanner.nextInt();
    switch (day){
        case 1 :
            System.out.println("Mon");
        case 2 :
            System.out.println("Tue");
        case 3 :
            System.out.println("Wed");
        case 4 :
            System.out.println("Thur");
        case 5 :
            System.out.println("Fri");
        case 6 :
            System.out.println("Sat");
        case 7 :
            System.out.println("Sun");
        default:
            System.out.println("Please Enter Valid Number from 1 to 7 ");



    }

}
}
