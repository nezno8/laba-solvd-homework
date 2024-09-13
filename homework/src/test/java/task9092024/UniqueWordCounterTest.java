package task9092024;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    private static File inputFile;
    @BeforeAll
    public static void setUp() {
        inputFile = new File("..\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
    }

    @Test
    public void testReadFromFile() throws IOException {
        String expectedOutput = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod";
        String actualOutput = UniqueWordCounter.readFile(inputFile);
        assertEquals(expectedOutput, actualOutput);
    }

//    @Test
//    public void testSplitWordsInLine(){
//        String [] expectedOutput = "Ala have cat and cat have Ala".split(" ");
//        String [] actualOutput = UniqueWordCounter.splitWordsInLine(appendsLinesByNewLine);
//        assertEquals(expectedOutput, actualOutput);
//    }

}