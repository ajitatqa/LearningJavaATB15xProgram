package exam_18Jan_2026;

public class Reverse_String {


        public static void main(String[] args) {
            String input = "Hello";
            String reversed = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            System.out.println("Reversed String: " + reversed);
        }
    }


