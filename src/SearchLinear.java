import java.util.Arrays;
import java.util.Scanner;

public class SearchLinear {
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
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(searchElement(arr)));
    }

    static int[] searchElement(int[] arr ){
        if(arr.length==0){
            return  arr;
        }
        for (int i=0; i<arr.length; i++) {
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    Swap(arr, j, j-1);
                }
                else
                    break;
            }
        }
        return arr;
    }
    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }
}
