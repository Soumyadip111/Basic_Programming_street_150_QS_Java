
public class Basic_Qs_16 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;  // here i use  sum = 0 for if we add with 0 + 1 we will get  1 
        for (int i = 0; i < arr.length; i++) {  
            sum += arr[i];  // first iteration 0+1 to arr.length
        }
        System.out.println("Sum is " + sum);
    }
}
