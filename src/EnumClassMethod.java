public class EnumClassMethod {
    enum Animals {
        H1(54), h2(55), h3(56), h4(57);

        private int height;

        Animals(int height) {
            this.height = height;
        }

        int display() {
            return height;
        }
//}
    }
}
class EnumMainClass {
    public static void main(String[] args) {
        System.out.println(EnumClassMethod.Animals.h4.display());
    }
}
