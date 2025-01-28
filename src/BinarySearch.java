import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int target = 810;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Your Target");
        int target = sc.nextInt();
        System.out.println("Your Target is at index :");
        System.out.println(BinarySearching(arr, target));
    }

    public static int BinarySearching(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid] == target)
                return mid;

            else if(arr[mid]>target)
                high = mid-1;

            else
                low = mid+1;
        }
        return -1;
    }
}
