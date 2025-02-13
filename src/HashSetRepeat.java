import java.util.HashSet;

public class HashSetRepeat {
    public static void main(String[] args) {
        String str = "vikash";
        str = str.toLowerCase();
        System.out.println(checkDuplicate(str));

    }

    public static boolean checkDuplicate(String str){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))){
                return false;
            }
        }
        return true;

    }
}
