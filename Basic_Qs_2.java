import java.util.*;

public class Basic_Qs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as an input : ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("Number is prime");
        } else {
            boolean isPrime = true;
            // Math.sqrt is square of a number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop early if a divisor is found

                }
            }
            if (isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println(" This Number is a composite number not a prime number");
            }
        }
    }
}
