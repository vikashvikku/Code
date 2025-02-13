import java.util.*;
public class RailFenceCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text");
        String str = sc.nextLine();
        System.out.println("Enter Key");
        int key=sc.nextInt();

        System.out.println(Encryption(str, key));
        System.out.println(Decryption(str, key));

    }

    static String Encryption(String str, int key){
        String EncryPted = "";

        boolean check =false;
        int j=0;
        int row = key;
        int col = str.length();
        char [][] arr= new char[row][col];

        for (int i = 0; i < col; i++) {

            if(j==0 || j==row-1){
                check = !check;
            }

            arr[j][i] = str.charAt(i);

            if(check){
                j++;
            }
            else{
                j--;
            }
        }

//        Printing the value
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(arr[i][k] +" ");
            }
            System.out.println("");
        }

//        Inserting into the String
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if(arr[i][k] != 0 ){
                    EncryPted += arr[i][k];
                }
            }
        }

        return EncryPted;
    }

    static String Decryption(String str, int key){
        String Decrypted = "";

        boolean check = false;
        int j=0;
        int row = key;
        int col = str.length();
        char[][] arr = new char[row][col];

        for (int i = 0; i < col; i++) {
            if(j==0 || j==row-1){
                check = !check;
            }

            arr[j][i] ='*';

            if(check){
                j++;
            }
            else {
                j--;
            }
        }
        int index=0;
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if(arr[i][k]=='*' && index<col){
                    arr[i][k] = str.charAt(index++);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                System.out.print(arr[i][k] +" ");
            }
            System.out.println("");
        }

//        Now Inserting to the String
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < col; k++) {
                if(arr[i][k] !=0)
                    Decrypted += arr[i][k];
            }
        }

        return Decrypted;
    }
}
