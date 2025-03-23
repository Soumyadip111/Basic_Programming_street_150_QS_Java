import java.util.*;

public class Basic_Qs_4 {

    public static boolean CheckArmstrong(int num) {
        int SameNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // length of number (153 = length 3)

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digits, digit);
            num /= 10; // remove last digit
        }
        return sum == SameNum; // sum becomes 0 to 153 after iteration then SameNum is same equal to num
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (CheckArmstrong(num)) {
            System.out.println(num + " is Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }
    }
}
