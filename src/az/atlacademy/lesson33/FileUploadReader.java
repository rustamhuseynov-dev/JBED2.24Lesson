package az.atlacademy.lesson33;

import java.io.*;
import java.util.Iterator;

public class FileUploadReader {

    public static final String RESOURCE = "D:\\JBED2.24Lesson\\JBED224\\src\\az\\atlacademy\\lesson33";

    public static final File FILE = new File(RESOURCE + "a.txt");

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter(FILE);
            fileWriter.write("Hello world");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(FILE)){
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
