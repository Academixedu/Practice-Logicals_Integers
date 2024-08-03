import java.util.Scanner;

public class FindSum {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; 
        }
        if (num % 2 == 0) {
            return false; 
        }
        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        int temp = num;
        int rev = 0;

        // Reverse the number
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        // Initialize position and process digits
        int position = 1;

        while (rev != 0) {
            int digit = rev % 10; // Extract the last digit
            if (isPrime(position)) { // Check if the position is prime
                sum += digit; // Add digit to sum
            }
            rev = rev / 10; // Remove the last digit
            position++; // Move to the next position
        }
        
        // Print the result
        System.out.println("Sum of digits at prime positions: " + sum);
    }
}
