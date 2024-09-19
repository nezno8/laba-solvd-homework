package task9092024;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static File inputFile = new File("..\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
    static File outputFile = new File("..\\homework\\src\\test\\resources\\test_output_testWriteToFile.txt");

    public static void main(String[] args) throws IOException {
        String inputFileContent = FileClass.readFile(inputFile);

        List<String> splitFileContent = UniqueWordCounter.splitOnWordsAsList(inputFileContent);
        Map<String, Integer> countedWords = UniqueWordCounter.countWordOccurrences(splitFileContent);
        Map<String, Integer> sortedWordsMap = UniqueWordCounter.sortedWordOccurrences(countedWords);
        String outputFileContent = UniqueWordCounter.writeOutSortedWordOccurrences(sortedWordsMap);

        FileClass.writeToFile(outputFile,outputFileContent);
    }

}
