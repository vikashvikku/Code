// WAP to check that a particular value is present in a map or not.
// If it is present return the corresponding key of that value
import java.util.HashMap;
public class HashMapIsPresent {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        Insertion in a map
        map.put("n1", 94);
        map.put("n2", 92);
        map.put("n3", 95);
        map.put("n4", 91);

        int v = 95;
        System.out.println(findKey(map, v));

    }
    public static String findKey(HashMap<String, Integer> map, int v){
        for(String key:map.keySet()) {
            if (map.get(key)==v) {
                return key;
            }
        }
        return "Element Not Found";
    }
}
