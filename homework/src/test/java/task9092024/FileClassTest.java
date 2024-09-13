package task9092024;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileClassTest {

    private static File inputFile;
    private static File outputFile;
    private static Map wordsStatistic;
    @BeforeAll
    public static void setUp() {
        inputFile = new File("..\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
        outputFile = new File("..\\homework\\src\\test\\resources\\test_output_testWriteToFile.txt");
    }

    @Test
    public void testReadFromFile() throws IOException {
        int expectedOutput = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod".split("\n").length;
        int actualOutput = FileClass.readFile(inputFile).size();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWriteToFile() throws IOException {
        Boolean expectedOutput = true;
        Boolean actualOutput = FileClass.writeToFile(outputFile, wordsStatistic);
        assertEquals(expectedOutput, actualOutput);
    }

}