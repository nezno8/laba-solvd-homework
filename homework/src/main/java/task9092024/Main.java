package task9092024;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class Main {
    static File inputFile = new File("..\\homework\\src\\test\\resources\\test_input_testReadFromFile.txt");
    static File outputFile = new File("..\\homework\\src\\test\\resources\\test_output_testWriteToFile.txt");

    public static void main(String[] args) throws IOException {
        FileClass.writeToFile(
                outputFile, UniqueWordCounter.writeOutSortedWordOccurrences(
                        new TreeMap<>(
                                UniqueWordCounter.sortedWordOccurrences(
                                        UniqueWordCounter.countWordOccurrences(
                                                UniqueWordCounter.sortWords(
                                                        UniqueWordCounter.splitOnWordsAsList(
                                                                FileClass.readFile(inputFile)
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
    }

}
