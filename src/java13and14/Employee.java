package java13and14;

public record Employee(String name,int salary) {
    //Can to declare class level variable. We can declare only static variable
    static int x = 5;

    public void sayHello(){
        System.out.println("Hello");
    }
}
