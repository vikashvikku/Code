import java.util.Arrays;

public class GenericClass <T>{
    T data;
    T data2;
    void setData(T data, T data2){
        this.data = data;
        this.data2 = data2;
//        return null;
    }
    T Display1(){
        return data;
    }
    T Display2(){
        return data2;
    }
}

class GenericMain{
    public static void main(String[] args) {

        GenericClass<String> gn1 = new GenericClass<String>();
        gn1.setData("Hello", "Vikash");
        System.out.println(gn1.Display1());
        System.out.println(gn1.Display2());
        GenericClass<Integer> gn2 = new GenericClass<Integer>();
        gn2.setData(6, 8);
        System.out.println(gn2.Display1());
        System.out.println(gn2.Display2());
        GenericClass<int[]> gn3 = new GenericClass<int[]>();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {2, 5, 7, 3, 2, 4};
        gn3.setData(arr, arr1);
        System.out.println(Arrays.toString(gn3.Display1()));
        System.out.println(Arrays.toString(gn3.Display2()));
    }
}
