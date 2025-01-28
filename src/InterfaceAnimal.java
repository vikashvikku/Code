interface Animal {
    void sleep();
    void eat();

}

interface Animal1{
    void walk();
    void run();
}

interface Animal2{
    void play();
    void speak();
}

class Dog implements Animal, Animal1, Animal2{
    public void sleep(){
        System.out.println("Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
    public void walk() {
        System.out.println("Walking");
    }
    public void run() {
        System.out.println("Running");
    }
    public void play() {
        System.out.println("Playing");
    }
    public void speak() {
        System.out.println("Speaking");
    }
}

 class AnimalFeature{               // Main Class
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sleep();
        dg.eat();
        dg.walk();
        dg.run();
        dg.play();
        dg.speak();
    }
}
