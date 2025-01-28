// Nested Class

public class NestedClass {
    static String name = "Vikash";
    void great(){
        System.out.println("Its Great");
    }
    static class Inner{
        void display(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        NestedClass.Inner obj = new NestedClass.Inner();
        obj.display();
        NestedClass gt = new NestedClass();
        gt.great();


    }
}
