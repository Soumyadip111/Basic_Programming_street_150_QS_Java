//Write a program to print a half pyramid where each row contains twice the number of stars as the row number.

class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // print stars (2 * i stars)
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }
    }
}


// output

// **
// ****
// ******
// ********
// **********
