import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKthlast {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        int target = 4;
        reverseWithStackTarget(que, target);
    }

    public static void reverseWithStackTarget(Queue<Integer> que, int target){
        Stack<Integer> stk = new Stack<>();
        int i=0;

        if(que.isEmpty() || target<=0 || target>que.size()){
            return;
        }
        int len = que.size();
        int n = len-target;

        for(i=0; i<n; i++){
                System.out.println(que.poll());
        }

        while(i<len){
            stk.push(que.poll());
            i++;
        }
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }


    }
}
