import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionInput {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num=0;
//        try {
//            num = sc.nextInt();
//            num = num/0;
//        }
//        catch  (InputMismatchException e){
//            System.out.println("Exception Input type\n" + e);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Number cannot be divisible\n" + e);
//        }
        DivMatch(10);

        InputMatch();
    }

    public static void InputMatch(){
        Scanner sc = new Scanner(System.in);
        int num;
        try {
            System.out.println("Enter the Number");
            num = sc.nextInt();
        }
        catch  (InputMismatchException e){
            System.out.println("Exception Input type\n" + e);
        }
    }
    public static void DivMatch(int n){
        int num = 10;
        try {
            num = num/0;
        }
        catch  (ArithmeticException e){
            System.out.println("Exception Arithmetic type\n" + e);
        }
    }
}
