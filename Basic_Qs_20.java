import java.util.*;
public class Basic_Qs_20 {
   public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      System.out.print("Enter a number ");
      int n = sc.nextInt();
      int sum = 0;
      for (int i = 1; i < 28; i++) {
         if (28 % i == 0) {
            sum += i;
         }
      }
      if (sum == n) {
         System.out.println("Number is perfect");
      } else {
         System.out.println("Number is Not Perfect");
      }
   }
}
