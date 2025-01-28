//   Leet Code 162

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
//                int[] arr = {1,2,3,1};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Peak element is at index :");
        System.out.println(PeakEl(arr));
    }

    public static int PeakEl(int[] arr){
        int l = 0;
        int h = arr.length-1;

        while(l<h){
            int mid = (l+h)/2;
            if(arr[mid]> arr[mid+1]){
                h = mid;
            }
            else
                l=mid+1;

        }
        return l;
    }
}
