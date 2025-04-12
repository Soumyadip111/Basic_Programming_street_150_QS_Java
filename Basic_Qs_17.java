
public class Basic_Qs_17 {

    public static void main(String[] args) {
        int i = 1, a, b, c;

        while (i <= 500) {
            a = i % 10;           // units place
            b = (i / 10) % 10;    // tens place (cleaner way)
            c = i / 100;          // hundreds place

            if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
                System.out.println(i);  // only print if Armstrong
            }

            i++; // always increment

        }
    }
}
