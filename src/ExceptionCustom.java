import java.util.Scanner;

public class ExceptionCustom  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            CustomException(num);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CustomException(int num) throws Exception{
        if(num<0){
            {
                throw new Exception("This is Negative Value");
            }
        }
    }

}
