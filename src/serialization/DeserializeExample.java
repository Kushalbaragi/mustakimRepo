package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("/Users/kushalbaragi/Downloads/Mustakim/myfile.txt"));
            Emloyee emloyee = (Emloyee) objectInputStream.readObject();
            System.out.println(emloyee.empId+" "+emloyee.empName);
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
