
public class prime {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.print(i + "\t");

            }

        }
    }
}