public interface EnumInterface {
    void message();
}
enum InterEnum implements EnumInterface{
    Morning{
        @Override
        public void message() {
            System.out.println("Good  Morning");
        }
    },
    Evening{
        public void message(){
            System.out.println("Good Evening");
        }
    }
}

class EnumInterfaceMain{
    public static void main(String[] args) {
        InterEnum.Morning.message();
        InterEnum.Evening.message();
    }
}
