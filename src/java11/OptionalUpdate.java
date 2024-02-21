package java11;

import java.util.Optional;

public class OptionalUpdate {
    public static void main(String[] args) {
        Optional<String> str = Optional.empty();
        System.out.println(str.isEmpty());
        str = Optional.of("abc");
        System.out.println(str.isEmpty());
    }
}
