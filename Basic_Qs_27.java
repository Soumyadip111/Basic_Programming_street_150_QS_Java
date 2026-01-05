class SumFactors {
    public static void main(String[] args) {
        int a = 20;
        int sum = 0;
        for(int i =1; i<=a; i++){
            if( a % i ==0){
                sum += i;
            }
        }
        System.out.println("sum of factors" + sum);
    }
}
