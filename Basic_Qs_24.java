class Gcd {
    public static void main(String[] args) {
        int a = 14;
        int b = 16;

        while (b != 0) {
            int temp = b; 
            b = a % b; //  Smaller number % bigger number = smaller number
            a = temp;
        }

        System.out.println("GCD is " + a);
    }
}
