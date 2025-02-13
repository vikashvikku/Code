import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecursionCollectionPalindrome {
    public static void main(String[] args) {
        List <Integer>ls = new ArrayList<>();
        Collections.addAll(ls, 1, 2, 3, 2, 1);
        int start = ls.get(0);
        int end = ls.getLast();
        System.out.println("Without Recursion :"+palndrome((ArrayList<Integer>) ls, start, end));
        System.out.println("Using Recursion :"+palndromeRec((ArrayList<Integer>) ls, start, end));
    }
    public static boolean palndrome(ArrayList<Integer> ls, int left, int right){
        while(left<right){
            if(ls.get(left) != ls.get(right)){
                return false;
            }
        }
        return true;
    }

    public static boolean palndromeRec(ArrayList<Integer> ls, int left, int right){
        if(left >= right){
            return true;
        }

        if(ls.get(left) != ls.get(right)){
            return false;
        }

        return palndromeRec(ls, left+1, right+1);
    }
}
