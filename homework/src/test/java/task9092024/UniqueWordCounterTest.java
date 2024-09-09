package task9092024;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    @Test
    public void testReadFromFie() throws IOException {
        File inputFile = new File("..\\homework\\src\\main\\resources\\test_input_testReadFromFie.txt");
        String expectedOutput = "Ala have cat and cat have Ala";
        String actualOutput = UniqueWordCounter.readFromFie(inputFile);
        assertEquals(expectedOutput, actualOutput);
    }

}