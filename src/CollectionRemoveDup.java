import java.util.ArrayList;
import java.util.List;

public class CollectionRemoveDup {
    public static void main(String[] args){
        int[] arr = {1,2, 2, 2, 2, 4, 6, 8, 10};
        getOriginal(arr);
    }

    public static void getOriginal(int[] arr){
        List <Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!ls.contains(arr[i])) {
                ls.add(arr[i]);
            }
        }
        System.out.println(ls);
    }
}
