package task9092024;

import java.io.*;
import org.apache.commons.io.FileUtils;

public class FileClass {
    public static String readFile(File inputFile) throws IOException {
        return FileUtils.readFileToString(inputFile, "UTF-8");
    }

    public static Boolean writeToFile(File outputFile, String wordsStatistic) throws IOException {
        FileUtils.writeStringToFile(
                outputFile,
                wordsStatistic,
                "UTF-8",
                false);
        return outputFile.length() > 0;
    }
}