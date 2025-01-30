import java.util.Arrays;
public class GenericSwap<T> {
    public static <T> void swapGeneric(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        String[] arr = {"2", "3","6","8", "10"};
        swapGeneric(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
}


