package tasks;

public class Task3 {
    //Function to print the first 100 fibonacci numbers
    public static void main(String[] args) {
        int n = 100; // Number of Fibonacci numbers to print
        long[] fibonacci = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calculate the Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }

    }
}
