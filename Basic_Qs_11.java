import java.util.*;

public class Basic_Qs_11 {
    public static int Gcd(int a , int b){
        while(b!=0){
             int temp = b;
              b = a % b;
              a = temp;
        }
        return a;
    }

    public static int Lcm(int a , int b){
        return (a*b) / Gcd(a, b);
    }
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of a ");
        int a = sc.nextInt();
        System.out.println("Enter number of b ");
        int b = sc.nextInt();
       System.out.println(Lcm(a, b));

    }
    }

