import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueMinMaxDiff {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(2);
        que.add(4);
        que.add(6);
        que.add(8);
        que.add(10);
        printVal(que);
    }
    public static void printVal(Queue<Integer> que){
//        for(int ele : que){
//            System.out.println(ele);
//        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int el:que){
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
