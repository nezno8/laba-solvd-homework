package task9092024;

import java.io.*;
import java.util.Map;
import org.apache.commons.io.FileUtils;

public class FileClass {
    public static String readFile(File inputFile) throws IOException {
        StringBuilder contentOfFile = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String line;
        while( (line = bufferedReader.readLine() ) != null){
            contentOfFile.append(line).append("\n");
        }
        return contentOfFile.toString().trim();
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