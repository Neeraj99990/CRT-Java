import java.util.Scanner;

/**
 * Test31
 */
public class Test31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a num :");

        int num = sc.nextInt();

        if (num/=2) {
            System.out.println("is even  ");

        } else {
            System.out.println("IS odd ");
        }

    }
}