import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestVar {
    public static void main(String[] args) {
        int x = 10;
        var y = 12;

        Map<String, List<String>> m = new HashMap<>();
        var m1 = new HashMap<String, List<String>>();
        m1.put("1", List.of("abc", "xyz"));

        /*
        *var can not be used at class level variable
        * var can not be used to assign a lambda
        * we can not assign null to var
        * We can not use var as method parameter
        * In collection if left hand side we are using var and
        * right hand side we are not defining type it would be generic collection
        * */


    }


}
