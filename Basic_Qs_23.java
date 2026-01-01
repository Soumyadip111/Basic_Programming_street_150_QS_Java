
// Print all numbers between a and b divisible by 7.
class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        for(int i = a; i<=b; i++){
            if( i % 7 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
