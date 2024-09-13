package task9092024;

import java.io.*;

public class UniqueWordCounter {
    public static String readFile(File inputFile) throws IOException {
        StringBuilder contentOfFile = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        String line;
        while( (line = bufferedReader.readLine() ) != null){
            contentOfFile.append(line).append("\n");
        }
        return contentOfFile.toString().trim();
    }
}