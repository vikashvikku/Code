import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue <Integer> que = new LinkedList<>();
        que.add(4);
        que.add(5);
        que.add(6);

        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);
    }
}
