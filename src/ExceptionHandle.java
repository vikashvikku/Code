import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        HandleException(n);
    }
    public static void HandleException(int n){
        try {
            if(n%10==0)
                n = n/0;    //  After this it ignores the next line of this block
            if(n%5 ==0)
                System.out.println("Multiple of 5 as : "+n/5);

        }
        catch (ArithmeticException e){
            System.out.println(e+" \nDivision by Zero is not allowed");
        }
        }
}
