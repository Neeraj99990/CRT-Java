import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        
        System.out.println("The product of the first " + n + " natural numbers is: " + product);
        
        scanner.close();
    }
}
