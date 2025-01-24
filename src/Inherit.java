class Teachers{

    public void Teach(){
        System.out.println("I am the Teacher");
    }
}

class Student extends Teachers{
    public void Study(){
        System.out.println("I am the Student");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.Study();
        obj.Teach();

    }
}