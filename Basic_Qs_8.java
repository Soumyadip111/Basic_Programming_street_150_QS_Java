import java.util.*;

public class Basic_Qs_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number");
        int number = sc.nextInt();
        // Factorial 5 is  1x2x3x4x5 = 120
        int fact = 1;  // fact variable store the factorial result
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number +" is "+ fact);
    }
}
