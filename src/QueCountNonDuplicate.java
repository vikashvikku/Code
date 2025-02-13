import java.util.LinkedList;
import java.util.Queue;

public class QueCountNonDuplicate {
    public static void main(String[] args) {
        System.out.println(uniqueue());
    }

    public static int uniqueue(){
        Queue <Integer> que = new LinkedList<>();
        que.add(2);
        que.add(2);
        que.add(4);
        que.add(5);
        que.add(5);

        int xor = 0;

        while(!que.isEmpty()){
            xor ^= que.poll();
        }
        return xor;
    }
}
