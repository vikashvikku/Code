import java.util.*;

public class Start {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
       int[] arr = {1, 2, 1, 3, 1, 5};
       int del = 1;
       System.out.println(Arrays.toString(Del(del, arr)));
    }

    static int[] Del(int del, int[] arr){
        int count=0;
        int index = 0;
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(del == arr[i]){
                count++;
                index++;
                if(count == 2){
                    break;

                }
            }
        }
        if(count>1){
            for (int i = 0, j=0; i < arr.length; i++) {

                if(i != index){
                    System.out.println(arr[i]);
                    newArr[j] = arr[i];
                    j++;
                }
            }
        }
            return newArr;

    }
}
