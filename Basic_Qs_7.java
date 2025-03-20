import java.util.*;

public class Basic_Qs_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your Pyramid Height ");
        int h = sc.nextInt(); // Here 'h' use for here Height means number of rows
        for (int i = 1; i <= h; i++) {
            // Print spaces 
            for (int j = 1; j <= (h - i); j++) {
                System.out.print(" ");
            }
              // Print Star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}