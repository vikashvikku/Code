public class AbstShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(13.2, 26.9);
        Square sq = new Square(12.2);
        sq.area();
        rect.area();
        rect.shape();
    }
}

abstract class Shape{
    public abstract void area();
    public void shape(){
        System.out.println("Shape");
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    public void area(){
        System.out.println(length * breadth);
    }
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Shape{
    double side;
    public void area(){
        System.out.println(side*side);
    }
    Square(double side){
        this.side = side;
    }
}

