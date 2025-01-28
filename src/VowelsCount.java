import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
//        str = str.toLowerCase();
        System.out.println("Count is "+countVowels(str,0, 0));
    }

    public static int countVowels(String str, int index, int count){
        if(index == str.length())
            return count;

        char ch = str.charAt(index);
        if (ch >= 'a' && ch<='z'){
            count +=1;
        }
        return countVowels(str, index+1, count);
    }
}
