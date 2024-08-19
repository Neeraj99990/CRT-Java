import java.util.Scanner;
/**
 * Test24
 */
public class Test24 {

    public static boolean isPrime(int num){
        if (num < 2) {
            return false;
            
        }
        for(int i = 2; i <=Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to cheak if its prime : ");

        int num = sc.nextInt();

        boolean result = isPrime(num);
        System.out.println("Is " + num + " a prime number? " + result);


        sc.close();
        
    }
}