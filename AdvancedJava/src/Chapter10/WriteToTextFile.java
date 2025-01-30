package Chapter10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\Siyabonga Sithole\\Documents\\MyFile.txt";
        //"C:\Users\Siyabonga Sithole\Documents\MyFile.txt"


        try {
            File myFile = new File(path);
            FileWriter fw = new FileWriter(myFile);

           fw.write("writing to a file");
            fw.write("\n" + 123 + " what for now");


            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
