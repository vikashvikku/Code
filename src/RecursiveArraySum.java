import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value of index "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Recursive array is : ");
        System.out.println(SumArrayRecursive(arr, arr.length-1));
    }

    public static int SumArrayRecursive(int[] arr, int len){
    if(len < 0)
        return 0;
    return arr[len]+SumArrayRecursive(arr,len-1 );
    }
}
