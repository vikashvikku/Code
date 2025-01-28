// Enum Inside the class

public class EnumClass {
    enum Animal{
        DOG, CAT, GIRAFFE, TIGER, LION
    }

    public static void main(String[] args) {
        Animal an = Animal.TIGER;
        System.out.println(an);
        Engineering eg = Engineering.ROBOTICS;
        System.out.println(eg);
        System.out.println(Engineering.COMPUTER_SCIENCE.ordinal());
    }
}
// Enum outside the class
enum Engineering{
    MECHANICAL, COMPUTER_SCIENCE, ELECTRICAL, ROBOTICS, ELECTRONICS
}
