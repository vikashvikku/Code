import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Fibonacci Value is \n"+fib(n));
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
        }
        public static int fib(int n) {
            if (n <= 1)
                return n;
            return fib(n - 1) + fib(n - 2);
        }
}
