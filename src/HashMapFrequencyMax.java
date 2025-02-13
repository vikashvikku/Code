// Return the number with maximum number of repeatation

import java.util.HashMap;

public class HashMapFrequencyMax {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 8, 6, 8, 8, 4, 6, 4, 4, 4};

        System.out.println(maxFrequency(arr));
    }

    public static int maxFrequency(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int el:arr){
            map.put(el, map.getOrDefault(el, 0)+1);
        }

        int max=0;
        int maxKey=0;
        for(int val:map.keySet()){
            if(map.get(val)>max){
                max = map.get(val);
                maxKey = val;
            }
        }
        return maxKey;
    }
}
