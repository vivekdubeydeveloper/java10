package java13and14;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int k = 2;

        String s = switch (k) {

            case 1:
                yield "Hello";
            default:
                throw new IllegalStateException("Unexpected value: " + k);
        };
        System.out.println(s);
    }
}
