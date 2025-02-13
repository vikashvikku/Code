import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//        Insertion in a map
        map.put("S1", 94);
        map.put("S2", 92);
        map.put("S3", 95);
        map.put("S4", 91);
        traverse(map);
    }

    public static void traverse(HashMap<String, Integer> map){
        for(Map.Entry<String, Integer> obj : map.entrySet()){
            System.out.println(obj.getKey()+ " "+ obj.getValue());
        }
    }
}
