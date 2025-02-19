import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// WAP to find the duplicate elements in an array and return the duplicate elements
public class HashMapHashSetDuplicate {
    public static void main(String[] args) {
        int[]arr = {2, 4, 4, 3, 2, 6, 8, 6};
        System.out.println(findDupl(arr));
        System.out.println(mapDup(arr));

    }

    public static HashMap<Integer, Integer> mapDup(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        HashMap <Integer, Integer> map1 = new HashMap<>();
        for(int ar:arr){
            map.put(ar, map.getOrDefault(ar, 0)+1);
        }
        System.out.println(map);

        for(int el:map.keySet()){
//            if(map.get(el)<=1){
//                map.remove(el);
//            }
            if(map.get(el)>1){
                map1.put(el, map.get(el));
            }

        }
        return map1;
    }

    public static HashSet<Integer> findDupl(int[] arr){
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();

        for(int el:arr){
            if(!set1.add(el)){
                set2.add(el);
            }
            set1.add(el);
        }
        return set2;
    }

}
