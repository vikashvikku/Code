public interface EnumInterfaceImplement {
    boolean isPrime(int num);
    boolean isPalindrom(int num);
}

interface EnumInterfaceImplement1{
    int isEven(int num);
}

enum checkImplement implements EnumInterfaceImplement, EnumInterfaceImplement1{
    CHECK {
        public boolean isPrime(int num) {
            if (num <= 1)
                return false;
            for (int i = 2; i * i < num; i++)
                if (num % i == 0)
                    return false;
            return true;
        }

//    PALINDROME
        @Override
        public boolean isPalindrom(int num) {
            long temp = num;
            long val = 0;
            while (num > 0) {
                long a = num % 10;
                val = (val * 10) + a;
                num = num / 10;
            }
            if (val == temp) {
                return true;
            } else {
                return false;
            }
        }
//    EVEN
        public int isEven(int num) {
            if(num%2==0)
                return 1;
            return 0;
        }
    };
}

class EnumInterFaceImplementMain{
    public static void main(String[] args) {

        System.out.println(checkImplement.CHECK.isPrime(12));
        System.out.println(checkImplement.CHECK.isPalindrom(12));
        System.out.println(checkImplement.CHECK.isEven(12));

    }
}