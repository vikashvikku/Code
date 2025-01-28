public class StringPalindrome {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(recursiveCheck(str));
//        print(str, 0);
        if(recursiveCheck(str)==false){
            print(str,0);
        }
//        System.out.println("With Recursive method:- \n"+print(/str));
//        System.out.println("With loop method:- \n"+recursiveCheck(str));


//    with loop
//    public static boolean stringCheck(String str){
//        str = str.toLowerCase();
//        String str1="";
//        for (int i = str.length()-1, j=0; i >= 0; i--) {
//            str1 += str.charAt(i);
//            }
//        if(str1.equals(str)){
//            return true;
//        }
//        return false;
//
//    }
//  Recursive method
    }
    public static boolean recursiveCheck(String str){
        if(str.isEmpty()){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1))
            return false;
        return recursiveCheck(str.substring(1,str.length()-1));
    }

    public static void print(String str,int index){
        if(str.isEmpty()|| index==str.length()){
            return;
        }
        System.out.println(str.charAt(0));
        print(str,index+1);
    }

}



//public class Main {
//    public static void main(String[] args) {
//        String str = "abcdba";
//        System.out.println(recursiveCheck(str));
//
//        if (!recursiveCheck(str)) {
//            print(str, 0);
//        }
//    }
//
//    public static boolean recursiveCheck(String str) {
//        if (str.length() <= 1) {  // Fix: Correct base case
//            return true;
//        }
//        if (str.charAt(0) != str.charAt(str.length() - 1)) {
//            return false;
//        }
//        return recursiveCheck(str.substring(1, str.length() - 1));
//    }
//
//    public static void print(String str, int index) {
//        if (index == str.length()) {  // Fix: Stop condition should use index
//            return;
//        }
//        System.out.println(str.charAt(index));  // Fix: Print correct character
//        print(str, index + 1);
//    }
//}
