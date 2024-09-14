package task9092024;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordCounterTest {

    private static List <String> readFileToTest;
    private static List <String> splitLinesOnWordsFileToTest;

    @BeforeAll
    public static void setUp() throws IOException {
        File inputFile = new File("..\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
        readFileToTest = FileClass.readFile(inputFile);
        splitLinesOnWordsFileToTest = UniqueWordCounter.splitLinesOnWords(readFileToTest);
    }

    @Test
    public void testSplitLinesOnWords() {
        String[] lines = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod"
                .replace("\n"," ")
                .split(" ");
        List<String> expectedOutput = Arrays.stream(lines).toList();
        List<String> actualOutput = UniqueWordCounter.splitLinesOnWords(readFileToTest);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSortWords() {
        List <String> sortedWordsList = Arrays
                .stream("Ala has cat and cat has Ala\nTod has turtle and turtle has Tod"
                                .replace("\n"," ")
                                .split(" "))
                .sorted()
                .toList();
        List<String> expectedOutput = sortedWordsList;
        List<String> actualOutput = UniqueWordCounter.sortWords(splitLinesOnWordsFileToTest);
        assertEquals(expectedOutput, actualOutput);
    }
}
