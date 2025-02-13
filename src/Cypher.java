import java.util.*;
public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text");
        String str=sc.nextLine();
        System.out.println("Enter Key");
        int key = sc.nextInt();

        System.out.println(encryption(str, key));
        System.out.println(decryption(str, key));

    }

    static String encryption(String str, int key){
        String encrypted ="";
        boolean check = false;
        int j =0;
        int row = key;
        int col = str.length();
        char[][] arr =new char[row][col];

//        Making the matrix for encryption
        for(int i=0; i<col; i++){
            if(j==0 || j==row-1){
                check = !check;
            }
            arr[j][i] = str.charAt(i);
            if(check){
                j++;
            }
            else {
                j--;
            }
        }

//      Adding into the String Encrypted
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                if(arr[i][k] !=0){
                    encrypted += arr[i][k];
                }
            }
        }

//        Printing the matrix
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println("");
        }

        return encrypted;
    }

//    Decryption Method
    static String decryption(String str, int key){
        String decrypted ="";

        boolean check = false;
        int j =0;
        int row = key;
        int col = str.length();
        char[][] arr =new char[row][col];

//        Making the matrix for decryption
        for(int i=0; i<col; i++){
            if(j==0 || j==row-1){
                check = !check;
            }
            arr[j][i] = '*';
            if(check){
                j++;
            }
            else {
                j--;
            }
        }

        int index = 0;
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                if(arr[i][k]=='*' && index<col){
                    arr[i][k] = str.charAt(index++);
                }
            }
        }
//        Printing the matrix
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                System.out.print(arr[i][k] + " ");
            }
            System.out.println("");
        }

//        Adding into the String Encrypted
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                if(arr[i][k] !=0){
                    decrypted += arr[i][k];
                }
            }
        }

        return decrypted;
    }

}
