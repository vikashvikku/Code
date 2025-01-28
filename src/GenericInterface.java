public interface GenericInterface<T> {
    void display(T data);
}

class Intergeneric <T> implements GenericInterface<T>{
    public void display(T data){
        System.out.println(data);
    }
}

class GenericInterfaceMain{
    public static void main(String[] args) {
        Intergeneric<Integer> obj1 = new Intergeneric<>();
        obj1.display(24);

        Intergeneric<String> obj2 = new Intergeneric<>();
        obj2.display("Vikash");
    }
}



