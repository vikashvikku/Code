import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Vikash");
        System.out.println(opt.get());

//        Optional<String> opt1 = Optional.isEmpty();
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        Optional<String> opt1 = Optional.ofNullable (null);
        System.out.println(opt1);
        System.out.println(opt1.isEmpty());

    }

}
