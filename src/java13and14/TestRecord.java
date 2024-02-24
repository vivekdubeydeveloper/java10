package java13and14;

public class TestRecord {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 1000);
        System.out.println(e1);
        System.out.println(e1.name());
        System.out.println(e1.salary());
        Employee e2 = new Employee("Ravi", 1000);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        Employee e3= new Employee("Ravi", 1000);
        System.out.println(e3.hashCode());
        e3.sayHello();
    }
}
