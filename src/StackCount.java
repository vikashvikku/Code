import java.util.Stack;

public class StackCount {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(6);
        stk.push(8);
        stk.push(10);
        int target = 16;
        countStack(stk);
        System.out.println(checkStack(stk, target));
    }
    public static void countStack(Stack<Integer> stk) {
        int count = 0;
        for (int el : stk) {
            count++;
        }
        System.out.println(count);
    }
        public static boolean checkStack(Stack<Integer> stk, int target){

            for(int el : stk){
                if(el==target){
                    return true;
                }
            }
            return false;
    }

}
