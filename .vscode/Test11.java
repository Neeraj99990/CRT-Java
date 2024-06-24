import java.util.Scanner;

/**
 * Test11
 */
public class Test11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks : ");
        int n = sc.nextInt();

        if (n >= 91 && n <= 100) {
            System.out.println("A+");

        } else if (n >= 81 && n <= 90) {
            System.out.println("A");

        } else if (n >= 71 && n <= 80) {
            System.out.println("B+");

        } else if (n >= 61 && n <= 70) {
            System.out.println("B");

        } else if (n >= 51 && n <= 60) {
            System.out.println("C+");

        } else if (n >= 33 && n <= 60) {
            System.out.println("C");
        } else {
            System.out.println("fail");
        }
    }
}