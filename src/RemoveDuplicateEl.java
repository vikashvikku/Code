//   LEET CODE 26

import java.util.Arrays;

public class RemoveDuplicateEl {
    public static void main(String[] args) {
        int[] nums = {1,1, 2, 2, 2,3};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
        public static int[] removeDuplicates(int[] nums) {
            int j=0;
            int[] arr = new int[nums.length];

            for(int i=0; i<nums.length-1; i++){

                if(nums[i]!=nums[i+1]) {
                    arr[j++] = nums[i];
                    System.out.println("Index" + j + i + "Value" + arr[j]);
                }
            }

            arr[j++] = nums[nums.length-1];
            for (int i = 0; i < j; i++) {

                nums[i] = arr[i];
            }
            System.out.println(j);
        return arr;
    }
}
