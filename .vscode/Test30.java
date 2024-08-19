import java.util.Scanner;

public class Test30 {
    
    private static final int MAX = 5;

    
    static class Stack {
        int[] arr = new int[MAX];
        int top = -1;

        // Push an item onto the stack
        void push(int item) {
            if (top == MAX - 1) {
                System.out.println("Stack overflow: Cannot push " + item + ". The stack is full.");
                return;
            }
            arr[++top] = item;
            System.out.println(item + " is pushed onto the stack.");
        }

        // Pop an item from the stack
        int pop() {
            if (top == -1) {
                System.out.println("Stack underflow: The stack is empty.");
                return -999; // Return -999 as an error code
            }
            return arr[top--];
        }

        // Peek at the top item of the stack
        int peek() {
            if (top == -1) {
                System.out.println("Stack underflow: The stack is empty.");
                return -999; // Return -999 as an error code
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Peek");
            System.out.println("4: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an item to push: ");
                    int item = scanner.nextInt();
                    s.push(item);
                    break;

                case 2:
                    int poppedItem = s.pop();
                    if (poppedItem != -999) {
                        System.out.println(poppedItem + " is popped from the stack.");
                    }
                    break;

                case 3:
                    int peekItem = s.peek();
                    if (peekItem != -999) {
                        System.out.println(peekItem + " is on the top of the stack.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
