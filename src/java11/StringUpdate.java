package java11;

public class StringUpdate {
    public static void main(String[] args) {
        String s = "   ";
        System.out.println(s.isBlank());

        s = "I \nam \nhero of this movie";
        s.lines().forEach(System.out::println);

        char c = '\u2000';
        s = c+"abc" + c;
        System.out.println(s);
        System.out.println(s.trim());
        //trip method support unicode
        System.out.println(s.strip());

        System.out.println("-".repeat(50));
    }
}
