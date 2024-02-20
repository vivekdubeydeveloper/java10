import java.util.List;
import java.util.stream.Collectors;

public class TestImmutableCollections {
    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenList = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        evenList.add(12);
        System.out.println(evenList);

        /*If we will add element in list it will give runtime exception*/
        List<Integer> evenListUnmodi = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toUnmodifiableList());
//        evenListUnmodi.add(12);
        System.out.println(evenListUnmodi);
    }
}
