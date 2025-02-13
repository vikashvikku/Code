import java.util.HashMap;
import java.util.Map;

public class HashMapFrequencyMaking {
    public static void main(String[] args) {
        String str = "Dog Cat Lion Lion Cat";
        System.out.println(frquencyMap(str));
        System.out.println(frquencyMap(str).entrySet());

    }

    public static HashMap<String, Integer> frquencyMap(String str){
        HashMap <String, Integer> map = new HashMap<>();
        for (String word : str.split(" ")) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        return map;
    }
}
