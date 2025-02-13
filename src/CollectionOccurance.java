import java.util.ArrayList;
import java.util.List;

public class CollectionOccurance {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 5, 9, 2, 4, 5, 4};
        int target = 5;
        System.out.println(getOccurance(arr, target));
    }

    public static List<Integer> getOccurance(int[] arr, int target){
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                ls.add(arr[i]);
            }
        }

        if(ls.isEmpty()){
            ls.add(-1);
        }
        return ls;
    }
}
