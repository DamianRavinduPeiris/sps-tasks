package tasks;

import java.util.Arrays;

public class Task4 {
    //Function to find the largest possible number of a given array
    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};
        String largestNumber = findTheLargestNumber(arr);
        System.out.println("Largest number formed: " + largestNumber);
    }
    public static String findTheLargestNumber(int[] nums) {
        // Creating a string array to hold the numbers
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Handle the case where the largest number is 0
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number from sorted strings
        StringBuilder largestNum = new StringBuilder();
        for (String str : strNums) {
            largestNum.append(str);
        }

        return largestNum.toString();
    }
}
