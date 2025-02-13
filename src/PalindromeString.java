public class PalindromeString {
    public static void main(String[] args) {
        String str = "A@bcb$a";
        System.out.println(isPalindrome(str));
    }
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            String str1="";
            for (int i = s.length()-1, j=0; i >= 0; i--) {
                if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                    str1 += s.charAt(i);
                }
            }
            if(str1.equals(s)){
                return true;
            }
            System.out.println(str1);
            return false;
        }


}
