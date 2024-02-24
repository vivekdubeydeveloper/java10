package java12;

public class StringUpdate {
    public static void main(String[] args) {
        String s1 = "This is cat";
        System.out.println(s1);
        //indent method will add space  string
        System.out.println(s1.indent(5));
        //Remove space from begining
        s1 = " This is cat";
        System.out.println(s1);
        System.out.println(s1.indent(-5));

        //Transform String using any function
        String s2 = "10";
        int transform = s2.transform(Integer::parseInt);
        System.out.println(transform);
    }
}
