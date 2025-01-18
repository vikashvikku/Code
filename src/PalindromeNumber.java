import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        long num = sc.nextLong();
        Palindrome(num);
    }
    static void Palindrome(long num){
        long temp = num;
        long val = 0;
        while(num>0){
            long a = num%10;
            val = (val*10)+a;
            num = num/10;
        }
        if(val == temp){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

