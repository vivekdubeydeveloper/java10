package java17.serilization;

import java.io.*;

public class DeserializeEmployee {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(new File("Employee.ser"));
            ObjectInputStream ois = new ObjectInputStream(fin);
            ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java17.serilization.Employee");

            ObjectInputFilter objectInputFilter = ObjectInputFilter.allowFilter(cl -> cl.equals(Employee.class), ObjectInputFilter.Status.REJECTED);
            //ois.setObjectInputFilter(filter);
            //ois.setObjectInputFilter(objectInputFilter);
            ois.setObjectInputFilter(ObjectInputFilter.merge(filter,objectInputFilter));

            Employee employee =(Employee) ois.readObject();
            System.out.println(employee);
            fin.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
