import java.util.ArrayList;
import java.util.List;

public class CollectionDiffList {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 6;
        getDifference(arr, target);
        System.out.println(getOccurance(arr, target));
    }

//    Using Binary Search
    public static  void getDifference(int[] arr, int target){
        List<Integer> ls = new ArrayList<>();
        int start=0;
        int end =arr.length-1;

        int val=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                val=mid;
                break;
            } else if (arr[mid]>target) {
                end = mid-1;
            }
            else
                start= mid+1;
        }
        for (int i = 0; i < arr.length; i++) {
            ls.add(arr[i]-val);
        }
        System.out.println(ls);
    }

//    Without Binary Search
    public static List<Integer> getOccurance(int[] arr, int target){
        List<Integer> ls = new ArrayList<>();
        int val=0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                val=i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ls.add(arr[i]-val);
        }

        if(ls.isEmpty()){
            ls.add(-1);
        }
        return ls;
    }
}
