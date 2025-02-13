import java.util.HashMap;

public class HashMapDup {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

//        Insertion in a map
        map.put(null, "first value");
        map.put("S2", null);
        map.put(null, "Second Value");
        map.put("S4", null);

        System.out.println(map.entrySet());
    }
}
