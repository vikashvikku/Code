import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
    public static void main(String[] args) {
        Queue <Integer> que = new LinkedList<>();
        que.add(1);
        que.add(3);
        que.add(7);
        que.add(56);
        que.add(101);
        reverseWithStack(que);
    }

    public static void reverseWithStack(Queue<Integer> que){
        Stack <Integer> stk = new Stack<>();
        while(!que.isEmpty()){
            stk.push(que.poll());
        }
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }

    }
}
