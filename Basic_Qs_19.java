import java.util.*;

public class Basic_Qs_19 {

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // check all possible divisors, not just 2
                return false;
            }
        }

        return true;  // prime if no divisors found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int start = sc.nextInt();

        System.out.println("Enter End Number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {
            if (prime(n)) {
                System.out.print(n + " ");
            }
        }
    }
}
