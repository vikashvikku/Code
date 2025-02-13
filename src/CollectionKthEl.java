// WAP to find the Kth largest element in a list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionKthEl {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        Collections.addAll(ls, 1, 2, 3, 5, 1);
        Collections.sort(ls);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(ls.indexOf(ls.toArray().length -k-1));
    }
}
