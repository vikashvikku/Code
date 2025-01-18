import java.util.Arrays;
import java.util.Scanner;

public class MinMaxPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
//        int[] arr={1, 2, 6, 3, 8};
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Divisibility Check is :");
        System.out.println(MinMaxCheck(arr));
    }

    public static boolean MinMaxCheck(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min){
                min = arr[i];
            }
        }
        if((max-min) % max ==0 || (max-min) % min==0){
            return true;
        }
        return false;
    }

}
