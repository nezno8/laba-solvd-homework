package task9092024;

import java.io.*;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class FileClass {
    public static List<String> readFile(File inputFile) throws IOException {
        return FileUtils.readLines(inputFile, "UTF-8").stream().toList();
    }

    public static Boolean writeToFile(File outputFile, Map wordsStatistic) throws IOException {
        FileUtils.writeStringToFile(
                outputFile,
                String.valueOf(wordsStatistic),
                "UTF-8",
                false);
        return outputFile.length() > 0;
    }
}