package task9092024;

import java.io.*;
import org.apache.commons.io.FileUtils;

/**
 * The FileClass provides utility methods for reading from and writing to files.
 * It utilizes Apache Commons IO library for file operations, allowing for easy
 * handling of file content in UTF-8 encoding.
 */
public class FileClass {

    /**
     * Reads the content of a specified file and returns it as a String.
     *
     * @param inputFile The file to be read.
     * @return A String containing the content of the file.
     * @throws IOException If an error occurs while reading the file.
     */
    public static String readFile(File inputFile) throws IOException {
        return FileUtils.readFileToString(inputFile, "UTF-8");
    }

    /**
     * Writes a given string to a specified file. If the file already exists,
     * it will be overwritten.
     *
     * @param outputFile The file to which the string will be written.
     * @param wordsStatistic The string content to write to the file.
     * @return A Boolean indicating whether the file has content (length > 0).
     * @throws IOException If an error occurs while writing to the file.
     */
    public static Boolean writeToFile(File outputFile, String wordsStatistic) throws IOException {
        FileUtils.writeStringToFile(
                outputFile,
                wordsStatistic,
                "UTF-8",
                false
        );
        return outputFile.length() > 0;
    }
}
