import java.util.*;

public class Basic_Qs_13 {

    public static String Reverse(String str) { 
        char charArr[] = str.toCharArray();
        int left = 0, right = charArr.length - 1;

        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }

        return new String(charArr);  // Convert back to String
    }

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        System.out.print("Type anything: ");
        String str = sc.nextLine();
        
        String reversedStr = Reverse(str);
        System.out.println("Reversed String: " + reversedStr);
        
    }
}
