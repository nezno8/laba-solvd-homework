package task9092024;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    static File inputFile = new File("D:\\project\\task1\\laba-solvd-tasks-homework\\laba-solvd-homework\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
    static File outputFile = new File("D:\\project\\task1\\laba-solvd-tasks-homework\\laba-solvd-homework\\homework\\src\\test\\resources\\test_output_testWriteToFile.txt");

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
