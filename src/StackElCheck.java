import java.util.Stack;

public class StackElCheck {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9};
        int target = 8;
        System.out.println(isPresent(arr, target));
    }

    public static boolean isPresent(int[] arr, int target){
        Stack <Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stk.push(arr[i]);
            if(stk.peek()==target){
                return true;
            }
        }
        return false;
    }
}
