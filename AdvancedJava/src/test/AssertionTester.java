import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTester {

    @Test
    void testCalculation(){

        //Assign
         int num1 = 4, num2 = 1;
         int expected = 5;

        //Act
          int actual = num1 + num2;

          String name1 = "Dave";
          String name2 = "dave";
          int[] numbers = {5,4,3,2,1};
          int[] numbers2 = {1,2,3,4,5};

        //Assert
        assertEquals(expected, actual,"the results should be 5");

        //check if names are equal
        assertEquals(name1,name2);

        //check if arrays are equal

        assertArrayEquals(numbers,numbers2);

        //check if two arrays are of the same type

        assertSame(numbers,numbers2);

    }

    @Test
    void MultipleSessions(){

        //Assign
        int num1 = 4, num2 = 1;
        int expected = 5;

        //Act
        int actual = num1 + num2;

        String name1 = "Dave";
        String name2 = "dave";

        int[] numbers = {5,4,3,2,1};
        int[] numbers2 = {1,2,3,4,5};

        Assertions.assertAll( ()-> assertEquals(expected, actual,"the results should be 5"),
                              ()-> assertEquals(name1,name2),
                              ()-> assertArrayEquals(numbers,numbers2),
                              ()-> assertSame(numbers,numbers2)



        );


    }
}
