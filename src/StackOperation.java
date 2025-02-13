import java.util.Arrays;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        int[] arr = {1, 4, 65, 3, 3, 5, 44,18};
        stackOper(arr);
    }

    public  static void stackOper(int[] arr){
        Stack <Integer> stk = new Stack<Integer>();
        for(int i=0; i<arr.length; i++){
            stk.push(arr[i]);
        }
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.isEmpty());
        System.out.println(stk.size());
    }
}
