public class MaximumNumber {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = { 10, 5, 8, 20, 15 };

        // Initialize maxNumber with the first element of the array
        int maxNumber = numbers[0];

        // Iterate through the array to find the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + maxNumber);
    }
}
