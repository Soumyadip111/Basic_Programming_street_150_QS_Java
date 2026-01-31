   
class Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i =1; i<=n; i++){
            // for space
            for(int j = 0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            // asending order
            for(int k = 1; k<=i; k++)
            {
                System.out.print(k);
            }
            // desending order
            for(int p =i-1; p>= 1; p--){  // i faced problem on this line
                 System.out.print(p);
            }

            System.out.println();

        }
    }
}
// output
    1
   121
  12321
 1234321
123454321

