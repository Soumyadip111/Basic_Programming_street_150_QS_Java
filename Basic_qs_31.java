     
// right-aligned triangle of stars
class Main {
    public static void main(String[] args) {
        int n = 6;                               
    
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
