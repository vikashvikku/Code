//When the objects are in their respective Cache memory range and both the objects are having same values, then
// if you will be using "==" operator it will give Yes, Although you are comparing the references, it will give
// true because for the same values, no new object will be created the next one will be having the  references
// of previous one.(E.g - Cache value range of Integer is -128 to 127).

//So for this reason, 100 is giving true & 200 is giving false, because the range of Cache
public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
//        Integer a = 200;
//        Integer b = 200;
        if (a.equals(b)) {
            System.out.println("yes");
        }
        else{
                System.out.println("No");
            }
        if(a==b){
            System.out.println("True");
        }
        else
            System.out.println("False");
        }


}
