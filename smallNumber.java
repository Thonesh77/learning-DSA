public class smallNumber {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = { 100, 5, 88, 45, 33, 77, 1 };
        // Initialize smallNumber with the first element of the array
        int smallNumber = numbers[0];
        // Iterate through the array to find the small number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallNumber) {
                smallNumber = numbers[i];
            }
        }

        // Print the small number
        System.out.println("The small number is: " + smallNumber);
    }
}