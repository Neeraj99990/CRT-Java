import java.util.Scanner;

/**
 * Test2
 */
public class Test2 {

    int factorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a integer: ");
        int n = sc.nextInt();

        // Create an object of Test2 to call the instance method
        Test2 obj = new Test2();

        // Calculate the factorial
        int x = obj.factorial(n);

        // Print the result
        System.out.println("The Answer is : " + x);

        // Close the scanner
        sc.close();
    }
}
