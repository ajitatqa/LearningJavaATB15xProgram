package ex_01_Java_Basics;

public class Lab013_Three_Max {

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 9;
        int n3 = -11;

        int maxnumber = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

        System.out.println("Max out of three = " + maxnumber);
    }
}
