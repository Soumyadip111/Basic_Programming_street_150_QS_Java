

class Pattern {
    public static void main(String[] args) {
        int n =5;
        for(int i = 0; i<n; i++){
            for(int j =0; j<=i; j++){
              char ch = (char) ('A' +j);
                 System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

// output
// A
// A B
// A B C
// A B C D
// A B C D E
