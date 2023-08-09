package fileopertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File f1=new File("/Users/kushalbaragi/Downloads/Mustakim/myfile.txt");
            System.out.println(f1.getAbsolutePath());
            System.out.println(f1.length());
            FileWriter fileWriter=new FileWriter(f1.getAbsoluteFile());
            fileWriter.write("This file is for testing purpose..!");
            fileWriter.close();
            if (f1.length()!=0){
                System.out.println("Data written into the file..!");
            }else{
                System.out.println("Please write some data..!");
            }
            Scanner data=new Scanner(f1);
            while (data.hasNextLine()){
                String alldata=data.nextLine();
                System.out.println(alldata);
            }
            data.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
