public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(recursiveCheck(str));
        print(str);
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

    public static void print(String str){
        if(recursiveCheck(str)==true){
            return;
        }
        if(str==null || str.isEmpty() || str.length()==0){
            return;
        }
        System.out.println(str.charAt(0));
        print(str.substring(1,str.length()-2));
    }

}

