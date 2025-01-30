package Chapter10;

import java.io.*;
import java.nio.file.Path;

public class FileReaders {

    public static void ReadNumbers() {


        String Path = "src/Chapter10/Resources/ReadNumbers.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(Path))) {


         System.out.println(br.readLine());
         br.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.out.println("cannot read numbers");
        }
    }


    public static void main(String[] args) {

        ReadNumbers();

        String filePath = "src/Chapter10/Resources/read_example.txt";
        File myFile = null;
        FileReader fr = null;
        BufferedReader br = null;

        try{
            myFile = new File(filePath);
            fr = new FileReader(myFile);
            br = new BufferedReader(fr);


            String data =br.readLine();

            while( data != null){
                System.out.println(data);
                data = br.readLine();

            }



        }catch(FileNotFoundException e){

            System.out.println("file not found");

        }catch (IOException io){

            System.out.println("cannot read from file");
        }


    }
}
