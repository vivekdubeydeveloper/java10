package java13and14;

public class PatternMatching {
    public static void main(String[] args) {
        Object object = getObject();
        if(object instanceof String str){
            //String str = (String) object;
            System.out.println(str);
        }


    }

    public static Object getObject(){
        return "Hello";
    }
}
