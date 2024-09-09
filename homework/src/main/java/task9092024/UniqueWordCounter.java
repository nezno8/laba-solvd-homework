package task9092024;

import java.io.*;

public class UniqueWordCounter {
    public static String readFromFie(File inputFile) throws IOException {
        StringBuilder contentOfFie = new StringBuilder();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

        String line;

        while( (line = bufferedReader.readLine() ) != null){
            contentOfFie.append(line).append("\n");
        }

        return contentOfFie.toString().trim();
    }
}