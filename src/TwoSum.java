public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr,target));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] arr = new int[len];
//        int start=0;
        for(int i=0; i<len; i++){
            for(int j=0; j<=numbers[i]; j++){
//                if(numbers[i]+numbers[j]==target){
////                    arr= new int[]{i, j};
//                    System.out.println(i);
//                }
                System.out.println(numbers[j]);
            }
        }
        return arr;
    }
}
