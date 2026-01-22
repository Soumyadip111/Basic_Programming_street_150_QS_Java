class Pattern {
    public static void main(String[] args) {
        int row =7;
        int n =1;
        for(int i =1; i<=row;  i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(n % 10 +" ");
                n++;
            }
                System.out.println();
        }
    }
}
// output

// 1
// 2 3
// 4 5 6
// 7 8 9 0
// 1 2 3 4 5
// 6 7 8 9 0 1
// 2 3 4 5 6 7 8

