// WAP to convert a character into an integer using wrapper classes and check that the given number is prime or not.

public class CharIsPrime {
    public static void main(String[] args) {
        char ch = '1';
//        Integer in = (int) ch;
        int in = Character.getNumericValue(ch);
        System.out.println(in);
        System.out.println(isPrime(in));
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i*i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
