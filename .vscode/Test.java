import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        int n, fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            while (n != 0) {
                fact = fact * n;
                n = n - 1;
            }
            System.out.println("The Answer is : " + fact);
        }
    }
}
