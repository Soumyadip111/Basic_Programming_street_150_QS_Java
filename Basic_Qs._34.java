class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // print (2*i - 1) stars
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }
    }
}


 // Output
// *
// ***
// *****
// *******
// *********
