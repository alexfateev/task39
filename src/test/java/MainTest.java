import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;

public class MainTest {

    @ParameterizedTest
    @ValueSource(strings = {"data.csv", "data.xml"})
    public void sourceFilesExists(String fileName) {
        boolean expected = true;
        File file = new File(fileName);

        boolean result = file.exists();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testParseXMLTOJSON() {
        boolean expected = true;
        File file = new File("data2.json");
        file.delete();
        Main.parseXMLToJSON();
        boolean result = file.exists();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testParseCSVTOJDON() {
        boolean expected = true;
        File file = new File("data.json");
        file.delete();
        Main.parseCSVToJSON();
        boolean result = file.exists();
        Assertions.assertEquals(expected, result);
    }

//    @Test
//    public void test() {
//        Assertions.assertTrue(false);
//    }
}
