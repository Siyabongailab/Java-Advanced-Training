import Chapter9.Book;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookTest {

    @Test
    @DisplayName("Determine Book Type")
    void TestDetermineType(){

        //assign
        int pages = 12;
        String expected = "Article";

        //Actual

        Book objBook = new Book();
        String actual = objBook.determineType(pages);

        //assertions
       //BVA testing ....have achieved maximum coverage.
        Assertions.assertAll(
                ()-> assertEquals("No type", objBook.determineType(0)),
                ()-> assertEquals("Article", objBook.determineType(1)),
                ()->assertEquals("Article", objBook.determineType(12)),
                ()->assertEquals("Article", objBook.determineType(15)),
                ()-> assertEquals(" Research Paper ", objBook.determineType(16)),
                ()-> assertEquals(" Research Paper ", objBook.determineType(25)),
                ()-> assertEquals(" Research Paper ", objBook.determineType(50)),
                ()->assertEquals("Book", objBook.determineType(51)),
                ()->assertEquals("Book", objBook.determineType(75))

        );

    }



    @Test
    @DisplayName("should not create a book with zero pages")

    void NoZeroPageBook(){

        int page = 0;
        assertThrows(IllegalArgumentException.class,()-> new Book ("2020500", "River",page));


    }

    @ParameterizedTest
    @CsvSource(value = {"20050, think like a monk, 500", "300, Java fundamentals, 19", "77,Agile methodology,0","isb344,think think,"})

    void CreateMultiplebooks(String Isbn, String title, int pages){

        Book objBook = new Book (Isbn, title, pages);
        System.out.println(objBook.determineType(pages));

    }

}
