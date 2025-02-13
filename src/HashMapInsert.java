import java.util.HashMap;

public class HashMapInsert {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();

//        Insertion in a map
        map.put("stud1", 94);
        map.put("stud2", 92);
        map.put("stud3", 95);
        map.put("stud4", 91);
        map.put("stud5", 98);

//        getting output with key
        System.out.println(map.get("stud3"));

//        getting the whole map as output
        System.out.println(map.entrySet());

//        Checking the particular value contains or not
        System.out.println(map.containsKey("stud4"));;

//        Checking the particular value contains or not
        System.out.println(map.containsValue(95));

//         Removing a key-value pair in a map
        System.out.println(map.remove("stud2"));

        System.out.println(map.entrySet());

//        Printing all the key of a map
        for ( String str:map.keySet()){
            System.out.println(str);
        }

    }
}
