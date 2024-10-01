import java.util.Scanner;

/**
 * Recursion
 */
public class Recursion {

    public static int factorial(int n){
        if (n == 0|| n == 1) {
            return 1;
            
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a number :");

        int num = sc.nextInt();


        if (num < 0) {
            System.out.println("Factorial is not defined for negative number :");
            
        }
        else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        
    }
}