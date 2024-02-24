package java13and14;

public class StringContentBlock {
    public static void main(String[] args) {
        String s = "{\"name\":\"vivek\"}";
        System.out.println(s);
        //Content block will print sting in same format as we write not in a single line if we want single line add / end of each line
        String s1 = """
                {
                "name":"vivek"
                "salary":1000
                }
                """;
        System.out.println(s1);
    }
}
