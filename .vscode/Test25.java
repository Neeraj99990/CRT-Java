public class Test25 {
    public static void main(String[] args) {
        int n = 5; // Number of lines
        int startAscii = 97; // ASCII value of 'a'

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(startAscii + j));
            }
            System.out.println();
        }
    }
}
