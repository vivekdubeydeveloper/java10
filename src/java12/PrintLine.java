package java12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintLine {
    public static void main(String[] args) {
        IntStream.range(1,8).forEach(x->System.out.println("-".repeat(1000)));
    }
}
