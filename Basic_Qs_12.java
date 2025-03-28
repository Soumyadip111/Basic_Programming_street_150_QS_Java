
import java.util.*;


public class Basic_Qs_12 {

    public static void main(String[] args) {
        int vowels = 0, con = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type anything ");
        String st = sc.nextLine(); 
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
             if(Character.isLetter(ch)){  // ignore space
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                con++;
            }
        }
        }
        System.out.println("Count of Vowels " + vowels);
        System.out.println("Count of Consonats " + con);
    }
}
