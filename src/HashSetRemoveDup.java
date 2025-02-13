// Given a string, remove the duplicate characters while maintaining the order

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetRemoveDup {
    public static void main(String[] args) {
        String str = "HeyHello Bye";
        removeDuplicate(str);
    }

    public static void removeDuplicate(String str){
        LinkedHashSet <Character> ls = new LinkedHashSet<>();
        String s = "";
        for(char ch:str.toCharArray()){

            if(ls.add(ch)){
                s= s + ch;
            }
        }
        System.out.println(s);
    }
}
