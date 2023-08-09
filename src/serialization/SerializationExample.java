package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Emloyee emp = new Emloyee(121, "Nayan");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/kushalbaragi/Downloads/Mustakim/myfile.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(emp);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Data has been read from the file..!");
        }
        catch(FileNotFoundException f){
            f.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
