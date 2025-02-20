import java.util.*;

public class Basic_Qs_1 {
    public static  void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number as an input : ");
        int  num = sc.nextInt();   
         // Explanation "If num is divisible by 2 ( num % 2 == 0), then it is even; otherwise, it is odd."
        if(num % 2 == 0){     
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
