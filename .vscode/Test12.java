import java.util.Scanner;

/**
 * Test12
 */
public class Test12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year : ");
        int n = sc.nextInt();

        if (n % 400 == 0) {
            System.out.println("Leap Year");

        } else if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("Leap Year");

        } else {
            System.out.println("Not a Leap Year");
        }
    }
}