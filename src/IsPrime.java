public interface IsPrime {
    boolean isPrime(int n);
}

class CheckPrime implements IsPrime{
    public boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i*i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

class CheckingPrime{
    public static void main(String[] args) {
        CheckPrime cp = new CheckPrime();
        System.out.println(cp.isPrime(143));
    }
}
