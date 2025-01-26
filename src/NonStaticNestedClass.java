//  Non-Static Nested Class

public class NonStaticNestedClass {
    private String name = "Vikash";

    class InnerClass{
        void display(){
            System.out.println(name);
        }
    }
}

class Calling{

    public static void main(String[] args) {
        NonStaticNestedClass out = new NonStaticNestedClass();
        NonStaticNestedClass.InnerClass obj = out.new InnerClass();
        obj.display();
    }
}
