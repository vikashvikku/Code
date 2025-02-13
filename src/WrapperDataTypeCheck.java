// WAP to check that a given character is letter, digit, whitespace, or any special characters using wrapper class
// and its functions.

import java.util.Scanner;

public class WrapperDataTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char ch = sc.next().charAt(0);
        isCheck(ch);
        System.out.println("Enter The String ");
        String str = sc.next();
        isCheckRemove(str);
    }

    public static void isCheck(char ch){
        if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        if(Character.isWhitespace(ch)){
            System.out.println("whitespace");
        }
        if(Character.isLetter(ch)){
            System.out.println("Letter");
        }
        else{
            System.out.println("It is Special Character");
        }
    }
// Remove the Special characters
        public static void isCheckRemove(String str){
        String st = "";
        for(int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                st = st+str.charAt(i);
            }
            else if (Character.isWhitespace(str.charAt(i))) {
                st = st+str.charAt(i);
            }
            else if (Character.isLetter(str.charAt(i))) {
                st = st+str.charAt(i);
            } else {
                continue;
            }

        }
            System.out.println(st);
    }
}
