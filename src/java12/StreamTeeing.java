package java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeeing {
    public static void main(String[] args) {
        Result collect = Stream.of(5, 10, 15, 20, 25, 21).collect(Collectors.teeing(Collectors.counting(), Collectors.filtering(n -> n > 10, Collectors.toList()), Result::new));
        System.out.println(collect);
    }
}
