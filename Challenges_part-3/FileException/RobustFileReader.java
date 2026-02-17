package FileException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the name of file you want to read");
        String fileName = input.next();
        try (FileReader fileReader = new FileReader(fileName)){
            int read;
            while ((read = fileReader.read() )!= -1){
                System.out.println((char)read);
            }
        }catch (FileNotFoundException exception){
            System.out.printf("File not found exception");
        }

        catch (IOException ex){
            System.out.printf("Exception occured: %s",ex.getMessage());
        }
    }
}
