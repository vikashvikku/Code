import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2,  1};
        System.out.println(stackPal(arr));
    }

    public static boolean stackPal(int[] arr){
        Stack <Integer> stk = new Stack<>();
        for (int k : arr) {
            stk.push(k);
        }
        for (int j : arr) {
            if (j != stk.pop()) {
                return false;
            }
        }
        return true;
    }
}
