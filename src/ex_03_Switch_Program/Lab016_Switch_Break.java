package ex_03_Switch_Program;

import java.util.Scanner;

public class Lab016_Switch_Break {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        {
            System.out.println("Enter the number 1 to 7 for the day");
            if (Scanner.hasNextInt())
            {
                int day = Scanner.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("Mon");
                        break;
                    case 2:
                        System.out.println("Tue");
                        break;
                    case 3:
                        System.out.println("Wed");
                        break;
                    case 4:
                        System.out.println("Thu");
                        break;
                    case 5:
                        System.out.println("Fri");
                        break;
                    case 6:
                        System.out.println("Sat");
                        break;
                    case 7:
                        System.out.println("Sun");
                        break;
                    default:
                        System.out.println("Please enter valid number 1 to 7");
                }
            }
        else
            {
                System.out.println("Invalid input ");


            }


        }
    }
}


