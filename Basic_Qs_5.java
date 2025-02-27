import java.util.*;

public class Basic_Qs_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int a = 0, b = 1; // Initialize the first two Fibonacci numbers

        System.out.print("Fibonacci Series: " + a);

        // If the limit is at least 1, include the second number (1)
        if (limit >= 1) {
            System.out.print(", " + b);
        }

        int next = a + b; // Calculate the next Fibonacci number

        // Loop to generate Fibonacci numbers until the limit is reached
        while (next <= limit) {
            System.out.print(", " + next);
            a = b; // Move `a` to the next number
            b = next; // Move `b` to the next number
            next = a + b; // Compute the next Fibonacci number
        }
    }

}
