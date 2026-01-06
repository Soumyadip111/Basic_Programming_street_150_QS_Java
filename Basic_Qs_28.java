class StrongNum {
    public static void main(String[] args) {
       int n = 145;
       int sum =0;
       int strong = n;

       while(n>0){
        int ld = n %10;
        int f = 1;
        for(int i =ld; i>0; i--){
            f = f *i;
        }
         sum = sum + f;
         n = n/10;
       }
       if(sum == strong){
          System.out.println("Yes its strong num");
       }else{
        System.out.println("Not a strong num");
       }
    }
}
