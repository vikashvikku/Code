import java.util.Stack;

public class StackPrintEl {
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(6);
        stk.push(8);
        stk.push(10);
        printVal(stk);
    }
    public static void printVal(Stack<Integer> stk){
        for(int ele : stk){
            System.out.println(ele);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int el:stk){
            if(el>max){
                max = el;
            }
            if(el<min){
                min = el;
            }
        }
        System.out.println("Difference is "+(max-min));
    }

}
