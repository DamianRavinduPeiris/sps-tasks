package tasks;

public class Task2 {
    // Function that combines two lists by alternating elements.
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d"};
        int[] numbers = {1, 2, 3, 4};

        String[] combined = combineLists(strings, numbers);
        for (String item : combined) {
            System.out.print(item + " ");
        }


    }
    public static String[] combineLists(String[] strings, int[] numbers) {
        int length = Math.min(strings.length, numbers.length);
        String[] combined = new String[length * 2];

        for (int i = 0; i < length; i++) {
            combined[i * 2] = strings[i];
            combined[i * 2 + 1] = String.valueOf(numbers[i]);
        }

        return combined;
    }

}
