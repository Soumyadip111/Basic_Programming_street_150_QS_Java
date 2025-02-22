import java.util.*;

public class Basic_Qs_3 {
    public static void main(String[] args) {
        // year % 4 == 0 → The year is divisible by 4.
        // year % 100 != 0 → The year should not be divisible by 100 (to exclude
        // non-leap century years).
        // year % 400 == 0 → The year should be divisible by 400(for leap year)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = sc.nextInt();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
