class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            int val;
            // decide starting value
            if (i == 1 || i == 4 || i == 5) {
                val = 1;
            } else {
                val = 0;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val; // flip 0 ↔ 1
            }

            System.out.println();
        }
    }
}
// output

// 1
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1
