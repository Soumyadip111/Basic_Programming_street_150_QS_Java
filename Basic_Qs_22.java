import java.util.*;

public class Basic_Qs_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a num ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of All Even Numbers : " + sum);
    }
}
