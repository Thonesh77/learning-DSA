import java.util.Scanner;

public class findingprimenumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = num.nextInt();
        int c = 2;
        while (c < number) {
            if (number % c == 0) {
                System.out.println("It's not a prime number");
                break;
            } else {
                c++;
            }
        }

        // If 'c' reached 'number' and 'number' is not divisible by any number except 1
        // and itself, it's a prime number
        if (c == number) {
            System.out.println("It's a prime number");
        }

        num.close(); // Close the Scanner object
    }
}
