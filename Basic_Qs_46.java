// Find the sum of all elements at odd indices.

class Main {
    public static void Odd_Indexsum(int arr[]){
         int sum =0;
       for(int i=0; i<arr.length; i++){
         if(i % 2 != 0){
            sum= sum +  arr[i];
         }
         
       }
         System.out.print(sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        Rotate(arr);
    }
}
