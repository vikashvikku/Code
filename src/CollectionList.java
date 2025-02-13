import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {

        String str ="A13B2565IT4";
        System.out.println("ArrayList is "+listGetDigit(str));
    }

    public static List<Integer> listGetDigit(String str){
        List <Integer> ls = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                ls.add(Character.getNumericValue(ch));
            }
        }
        System.out.println(ls);
        for (int i = 0; i < ls.toArray().length; i++) {
            System.out.println(ls.get(i));
        }
        return ls;
    }


}
