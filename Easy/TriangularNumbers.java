import java.util.Scanner;

public class TriangularNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the triangle number: ");
        int triNum = scanner.nextInt();

        if (triNum <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The " + triNum + "-th triangular number is: " + triangularNumbers(triNum));
        }
        scanner.close(); // Always close the scanner when done
    }

    public static int triangularNumbers(int triNum) {
        int result = 0; // Start with 0
        for (int i = 1; i <= triNum; i++) { // Include triNum in the sum
            result += i;
        }
        return result;
    }
}
