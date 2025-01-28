// Static Nested Class

public class NestedOuter {

    static class NestedInner{

        private int legs;
        private int hands;

        NestedInner(int legs, int hands){
            this.legs = legs;
            this.hands = hands;
        }
        public void move(){
            System.out.println("Legs are "+legs);
        }
        public void write(){
            System.out.println("hands are "+hands);
        }
    }

    public static void main(String[] args) {
        NestedOuter.NestedInner obj = new NestedOuter.NestedInner(2, 2);
        obj.move();
        obj.write();
    }

}
