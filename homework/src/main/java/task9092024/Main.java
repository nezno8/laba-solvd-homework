package task9092024;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The Main class serves as the entry point for the application.
 * It reads content from an input file, processes the text to count
 * and sort unique words, and then writes the results to an output file.
 */
public class Main {
    static File inputFile = new File("D:\\project\\task1\\laba-solvd-tasks-homework\\laba-solvd-homework\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
    static File outputFile = new File("D:\\project\\task1\\laba-solvd-tasks-homework\\laba-solvd-homework\\homework\\src\\test\\resources\\test_output_testWriteToFile.txt");

    /**
     * The main method serves as the entry point for the application.
     * It orchestrates reading from an input file, processing the content
     * to count and sort unique words, and writing the results to an output file.
     *
     * @param args Command-line arguments (not used).
     * @throws IOException If an error occurs during file reading or writing.
     */
    public static void main(String[] args) throws IOException {
        String inputFileContent = FileClass.readFile(inputFile);

        String[] splitFileContent = UniqueWordCounter.splitOnWords(inputFileContent);
        List<String> splitFileContentAsList = UniqueWordCounter.splitWordsAsList(splitFileContent);
        Map<String, Integer> countedWords = UniqueWordCounter.countWordOccurrences(splitFileContentAsList);
        Map<String, Integer> sortedWordsMap = UniqueWordCounter.sortedWordOccurrences(countedWords);
        String outputFileContent = UniqueWordCounter.writeOutSortedWordOccurrences(sortedWordsMap);

        FileClass.writeToFile(outputFile, outputFileContent);
    }
}
