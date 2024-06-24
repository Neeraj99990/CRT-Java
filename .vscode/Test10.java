import java.util.Scanner;

/**
 * Test10
 */
public class Test10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number1 ");
        int number1 = sc.nextInt();

        System.out.println("Enter  a number2 :");
        int number2 = sc.nextInt();

        System.out.println("Enter  a number3 :");
        int number3 = sc.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("number is " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("number is " + number2);
        } else {
            System.out.println("number is " + number3);
        }

    }
}