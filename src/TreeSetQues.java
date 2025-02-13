// Find the 2nd largest value from the array using Tree Set

import java.util.TreeSet;

public class TreeSetQues {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3 ,2, 6};
        System.out.println(secondLargest(arr));
    }

    public static  int secondLargest(int[] arr){
        TreeSet <Integer> ts = new TreeSet<>();
        for (int j : arr) {
            ts.add(j);
        }
        if(ts.size()<=2){
            return -1;
        }
        int last = ts.last();
        return ts.lower(last);
    }
}
