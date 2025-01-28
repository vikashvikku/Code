// Local Inner Class : - An Inner class inside the method of the outer class

public class LocalOuterClass {
    void innerMethod(){
        String name = "Vikash";
        class InnerLocal{
            void display(){
                System.out.println(name);
            }
        }
        InnerLocal In = new InnerLocal();
        In.display();
    }
}

class LocalMain{
    public static void main(String[] args) {
        LocalOuterClass out = new LocalOuterClass();
        out.innerMethod();
    }
}
