package Chapter10;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ExploreFileSystem {

    public static void main(String[] args) {

        FileSystem fs = FileSystems.getDefault();
        Path path = fs.getPath("C:\\Users\\Siyabonga Sithole\\Downloads\\CV_Associate SQA Engineer Intern_Siyabonga Sithole.pdf");

        System.out.println("File Name:" + path.getFileName() +
                           "\nRoot: " + path.getRoot() +
                           "\nParent: " + path.getParent() +
                            "\nCount " + path.getNameCount());

    }



}
