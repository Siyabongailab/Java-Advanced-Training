import org.junit.jupiter.api.*;

public class AnnotationTest {

    @Test
    void JustNormalTest(){
         System.out.println("@Test-just normal test");
    }

    @BeforeAll
    static void BeforeEverything(){

    }

    @BeforeEach
    void beforeEachMethod(){

    }
    @AfterEach
    void AfterEachMethod(){


    }
    @AfterAll
    static void AfterAllMethod(){

    }
    @Test
    void AnotherTestMethod(){


    }

    @Test
    void LastNormalTestMethod(){


    }
}
