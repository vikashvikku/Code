import java.util.HashSet;

public class HashSetOperation {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        set.remove(6);

        System.out.println(set.isEmpty());
        System.out.println(set.contains(7));

//        set.clear();

        traversal(set);
    }

    public static void traversal(HashSet<Integer> set){
        for(int ele:set){
            System.out.print(ele+" ");
        }
    }
}
