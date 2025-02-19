import java.util.TreeMap;

public class TreeMapOp {
    public static void main(String[] args) {
        TreeMap <Integer, String> map = new TreeMap<>();
        map.put(7, "prime");
        map.put(9, "Non Prime");
        map.put(12, "Non Prime");
        map.put(5, "Prime");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
