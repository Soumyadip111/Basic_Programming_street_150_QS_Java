

 class Pattern {
    public static void main(String[] args) {
        int row =6;
        // print first half 1 to 6
        for(int i =0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
        // print second half 6 to 1
        for(int i = row; i>=1; i--){
            for(int j= 1; j<=i; j++){
                  System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *
