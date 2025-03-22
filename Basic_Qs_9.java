import java.util.*;

public class Basic_Qs_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            // why use number % 10 , we use % for get last digit
            sum += number % 10;
            number /= 10; // we use division for remove the last digit
        }
        System.out.println("Sum of Digits " + sum);
    }
}
