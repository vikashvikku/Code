public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] nums= {5, 6, 7, 1,0, 1, 2, 3, 4};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;

        while(l<h){
            int mid = (l+h)/2;
            if(nums[mid]< nums[h]){
                h = mid;
            }
            else
                l = mid+1;
        }
            return nums[l];
    }
}
