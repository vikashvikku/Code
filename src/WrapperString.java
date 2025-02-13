public class WrapperString {
    public static void main(String[] args) {
        String str = "1214";
        int a  = Integer.parseInt(str);
        int b  = Integer.valueOf(str);
        System.out.println("a :- "+a+" "+ ((Object)a).getClass().getSimpleName());
        System.out.println("b :- "+b+ " "+ ((Object)a).getClass().getSimpleName());
        conversion("5");
    }

    public static void conversion(String str){
        Integer i = Integer.parseInt(str);
        System.out.println("Integer "+ i);
        Double d = Double.valueOf(str);
        System.out.println("Double "+ d);
        Long l = Long.parseLong(str);
        System.out.println("long "+ l);
        Character c = str.charAt(0);
        System.out.println("Character "+ c);
    }
}
