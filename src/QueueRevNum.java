import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueRevNum {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(3);
        que.add(7);
        que.add(56);
        que.add(101);
        int target = 3;
        reverseWithStackTarget(que, target);
    }

    public static void reverseWithStackTarget(Queue<Integer> que, int target){
        Stack<Integer> stk = new Stack<>();
        int i=0;

        if(que.isEmpty() || target<=0 || target>que.size()){
            return;
        }
        while(i<target){
            stk.push(que.poll());
            i++;
        }
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }

    }
}
