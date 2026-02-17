package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class kgWriter {
    public static void main(String[] args)  {
        String fileName = "java-course.txt";

        try(FileWriter writer = new FileWriter(fileName) ){

        writer.write("This is the best Java Course");
        writer.flush();
        System.out.println("File written Successfully");
    }catch (IOException exception){
            System.out.printf("Exception Occured : %s",exception.getMessage());
        }
    }
}
