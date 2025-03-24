import java.util.*;

public class Basic_Qs_10 {
    
        // Method to calculate GCD using the Euclidean algorithm
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Calculate GCD
        int result = gcd(a, b);

        // Output the result
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
    }
}

