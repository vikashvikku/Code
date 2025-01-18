import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
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
        System.out.println("Enter pos");
        int pos = sc.nextInt();
        System.out.println("Enter val");
        int val = sc.nextInt();
        System.out.println("Updated Array is :");
        System.out.println(Arrays.toString(InsertingEl(arr, pos, val)));
    }

    public static int[] InsertingEl(int[] arr, int pos, int val){
        int[] arr1 = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++) {
            if(i<pos-1){
                arr1[i] = arr[i];
            }
            else if(i==pos-1){
                arr1[i] = val;
            }
            else
                arr1[i] = arr[i-1];
        }
        return arr1;
    }
}
