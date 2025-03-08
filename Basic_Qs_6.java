import java.util.*;

public class Basic_Qs_6 {
    public static boolean CheckPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", ""); // Convert to lowercase and remove spaces

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false; // not a palindrome
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input"); // radar is true 
        String str = sc.nextLine();
        System.out.println(CheckPalindrome(str));
    }

}
