import java.util.Scanner;

/**
 * Test3
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first  number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second Number :");
        int num2 = sc.nextInt();

       int sum = num1+num2;

       System.out.println("The Answer is : "+ sum );

    }
    
}