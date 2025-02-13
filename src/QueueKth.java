import java.util.*;

public class QueueKth {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(5);
        que.add(3);
        que.add(2);
        que.add(8);
        int target = 4;
        System.out.println(findkSmall(que, target));
    }

    public static int findkSmall(Queue <Integer> que, int target){

        if(que.isEmpty() || target<=0 || target>que.size()){
            return -1;
        }

        List<Integer> ls = new ArrayList<>(que);
        Collections.sort(ls);
        return ls.get(target-1);
    }
}
