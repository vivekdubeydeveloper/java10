package java17.serilization;

import java.io.*;

public class SerializeEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Mohan", 1000);
        try (FileOutputStream fou = new FileOutputStream(new File("Employee.ser"))) {
            ObjectOutputStream oos = new ObjectOutputStream(fou);
            oos.writeObject(employee);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
