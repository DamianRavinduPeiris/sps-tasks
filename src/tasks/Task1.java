package tasks;

public class Task1 {
    // Sum using a for loop
    public static int sumWithForLoop(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Sum using a while loop
    public static int sumWithWhileLoop(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    // Sum using recursion
    public static int sumWithRecursion(int[] numbers) {
        return sumWithRecursionHelper(numbers, 0);
    }

    private static int sumWithRecursionHelper(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumWithRecursionHelper(numbers, index + 1);
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // Test the sum methods
        System.out.println("Sum using for loop: " + sumWithForLoop(numbers));
        System.out.println("Sum using while loop: " + sumWithWhileLoop(numbers));
        System.out.println("Sum using recursion: " + sumWithRecursion(numbers));
    }
}
