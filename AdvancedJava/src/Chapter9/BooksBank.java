package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class BooksBank {


    static List<String> books(){

        return new ArrayList<>(List.of("Think like a monk","Rich dad, poor dad","Psychology of money",
                             "Agile Methodology", "Manage Your money"));
    }
}
