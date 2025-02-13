// WAP to store the indices and elements of an array

import java.util.HashMap;

public class HashmapIndices {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        System.out.println(map);
    }
}
