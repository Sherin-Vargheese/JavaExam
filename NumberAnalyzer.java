import java.util.Scanner;

public class NumberAnalyzer {
    public static void analyzeNumber(int num) {

        System.out.println("Number " + num + " is:");

        if (num < 0) {                       //checking positive, negative or zero
            System.out.println("- Negative");
        } else if (num > 0) {
            System.out.println("- Positive");
        } else {
            System.out.println("- Zero");
            return;
        }

        if (num % 2 == 0) {                //checking even or odd
            System.out.println("- Even");
        } else {
            System.out.println("- Odd");
        }

        if (num % 5 == 0) {                //checking multiple of 5 or not
            System.out.println("- Multiple of 5");
        } else {
            System.out.println("- Not a multiple of 5");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 5) {
            System.out.print("Enter number " + i + " : ");
            int num = scanner.nextInt();
            analyzeNumber(num);
            i++;
        }
        scanner.close();
    }
}