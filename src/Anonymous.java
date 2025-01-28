public interface Anonymous {
    void move();
}

class MainAnonymous{
    public static void main(String[] args) {
        Anonymous an = new Anonymous() {
            @Override
            public void move() {
                System.out.println("The Animal is moving");
            }
        };
        an.move();

    }

}
