public class Encaps extends Maths {
    public static void main(String[] args) {
        Maths area = new Maths();
        area.setName(25);
        System.out.println(area.parentLength());
    }
}

class Maths{
    private int length;
    public void setName(int length) {
         this.length = length;
    }

    int parentLength(){
        System.out.println("Length is "+length);
        return length;
    }
}


