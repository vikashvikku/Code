import java.util.*;
public class Casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
//        String n = "";
        System.out.println(Cast(n));
    }

    public static boolean Cast(String a) {
        if (a.isEmpty()) {
            System.out.println("Its Empty String");
            return false;
        } else {
            int val = Integer.parseInt(a);
            if(val%5==0){
                System.out.println("Yes, Its divisible by 5");
                return true;
            }
            return false;
        }
    }
}