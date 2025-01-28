import java.util.Scanner;

public class ReverseRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for Add Method");
        int n = sc.nextInt();
        Add(n);
        System.out.println("Enter the Number for Reverse Method");
        int m = sc.nextInt();
        Reverse(m);
    }
    public static void Add(int n){
        if(n>25) {
            return;
        }
        else {
            System.out.println(n);
            Add(n+1);
        }
    }

    public static void Reverse(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        Reverse(n-1);
    }

}
