class LCM{
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int x = a;
        int y = b;

        // GCD using Euclidean Algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;

        int lcm = (a * b) / gcd;

        System.out.print("LCM " + lcm);
    }
}

