
import java.util.*;

public class Basic_Qs_18 {

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        for (int i = 1; i <= 10; i++) {  
            System.out.println(mul + " X " + i + " = " + mul * i); 
        }

    }
}
