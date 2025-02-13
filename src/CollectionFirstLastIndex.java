import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFirstLastIndex {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Collections.addAll(ls, 2, 4, 6, 4, 9, 4, 12);
        int len = ls.size();
        List<Integer> ls1 = new ArrayList<>();
        int target = 4;
        int first=-1;
        int last=-1;
        for (int i = 0; i <len ; i++) {
            if(ls.get(i) == target){
                if(first == -1){
                    first = i;
                }
                last=i;
            }
        }
        Collections.addAll(ls1, first, last);
        System.out.println(ls1);
    }
}
