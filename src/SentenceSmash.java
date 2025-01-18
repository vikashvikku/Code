import java.lang.*;
import java.util.*;

public class SentenceSmash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        CarFeature obj = new CarFeature(4, 1, 5, true);
        System.out.println(obj.wheels);
    }
}
   class CarFeature {
       int wheels;
       int Staring;
       int gears;
       boolean exhaust;

       public CarFeature(int w, int s, int g, boolean e) {
           this.wheels = w;
           this.Staring = s;
           this.gears = g;
           this.exhaust = e;
       }
   }
