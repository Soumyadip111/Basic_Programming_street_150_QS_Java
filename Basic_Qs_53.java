
   
code :

class Pattern {
    public static void main(String[] args) {
        int row =5;
         // first odd half

        for(int i=1; i<=row; i++){
            // for space
            for(int j= 0; j<row-i; j++)
            {
                System.out.print(" ");
            }
             // print star use of odd nums
            for(int k =0; k<i*2-1; k++){
                 System.out.print("*");
            }
            System.out.println();
        }
            // 2nd odd half

            // outer loop go to  4 -> 1
        for(int i=row-1; i>=1;i-- ){

            for(int j =row; j>i;j--) // for space
            {
                System.out.print(" ");
            }

            for(int k = 0; k <i*2-1; k++){
                System.out.print("*");
            }
                 System.out.println();
        }
    }
}
// output
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

