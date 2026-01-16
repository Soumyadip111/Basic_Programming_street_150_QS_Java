int n = 5;

for (int i = 0; i < n; i++) {

    // Step 1: Print the decreasing 'b' characters (Padding)
    // Starts at 4 'b's and reduces by 1 each row
    for (int j = 0; j < n - i - 1; j++) {
        System.out.print("b");
    }

    // Step 2: Print the alternating pattern (*b*b...)
    // Uses modulo (%) to swap between '*' and 'b'
    // Loop runs up to (2 * i) to ensure the pattern grows by 2 chars per row
    for (int k = 0; k <= 2 * i; k++) {
        if (k % 2 == 0) {
            System.out.print("*"); // Even positions are stars
        } else {
            System.out.print("b"); // Odd positions are 'b's
        }
    }

    // Move to the next line
    System.out.println();
}
// output 
//bbbb*
//bbb*b*
//bb*b*b*
//b*b*b*b*
//*b*b*b*b*

