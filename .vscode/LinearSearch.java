import java.util.Scanner;

public class LinearSearch {
    
    public static int linearSearch(int n, int[] arr, int item) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == item) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the item to search: ");
        int item = scanner.nextInt();
        
        int x = linearSearch(n, arr, item);
        
        if (x != -1) {
            System.out.println("Item found at index " + x);
        } else {
            System.out.println("Item not found");
        }

        scanner.close();
    }
}
