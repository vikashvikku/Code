import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCommonEl {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Collections.addAll(ls, 2, 4, 6, 8, 10);
        List <Integer> ls1 = new ArrayList<>();
        Collections.addAll(ls1, 6, 8, 14, 3, 5, 9);
        List <Integer> lsFinal = new ArrayList<>();

        int length = Math.max(ls.toArray().length, ls.toArray().length);
        for (int i = 0; i < length; i++) {
            int val = ls.get(i);
            if(ls1.contains(val)){
                lsFinal.add(val);
            }

        }
        System.out.println(lsFinal);
    }
}
