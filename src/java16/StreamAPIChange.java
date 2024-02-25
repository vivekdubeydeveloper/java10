package java16;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIChange {
    public static void main(String[] args) {
        List<String> strings = List.of("123", "321", "213", "456");
        List<Integer> intList1 = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
        //easier way in java 16
        List<Integer> intList2 = strings.stream().map(Integer::parseInt).toList();


    }

}
