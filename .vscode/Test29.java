import java .util.Scanner;
/**
 * Test29
 */
public class Test29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int size = sc.nextInt();
        int number[] = new int[size];


        System.out.println("Enter the array:");

        for(int i = 0; i < size; i++){
             number[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search :");

        int x = sc.nextInt();

      

        for(int i = 0; i < number.length; i++){
            if (number[i] == x) {
                System.out.println("the element is : " + i) ;
            }

        }
    }
}