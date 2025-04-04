
public class Basic_Qs_14 {

    public static int FindlargestNDSmallest(int arr[]) {
        int large = Integer.MIN_VALUE;  // Minimum_value is for Initialize with positive infinity 
        int small = Integer.MAX_VALUE;  // Maximum_Value is for  Initialize with negative infinity
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println("Smallest Number is " + small);
        return large;

    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 8, 5};
        System.out.println("Largest Number is " + FindlargestNDSmallest(arr));
    }
}
