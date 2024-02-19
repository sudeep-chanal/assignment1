
public class fibonacci {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 100;

        for (int i = 0; n >= fibonacci(i); i++) {
            System.out.print("[" + fibonacci(i) + "]" + "\t");
        }
    }
}
