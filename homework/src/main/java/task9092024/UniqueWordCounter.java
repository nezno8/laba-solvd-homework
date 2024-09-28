package task9092024;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * The UniqueWordCounter class provides functionality to process a given string of text
 * by splitting it into words, counting the occurrences of each unique word, sorting these
 * words, and formatting the results for output.
 */
public class UniqueWordCounter {

    /**
     * Splits the input string into an array of words based on whitespace and punctuation.
     *
     * @param toSplit The string to be split into words.
     * @return An array of words extracted from the input string.
     */
    public static String[] splitOnWords(String toSplit) {
        return StringUtils.split(toSplit);
    }

    /**
     * Converts an array of strings (words) into a list.
     *
     * @param splitLinesOnWords An array of words to be converted into a list.
     * @return A list containing the words from the input array.
     */
    public static List<String> splitWordsAsList(String[] splitLinesOnWords) {
        return Arrays.stream(splitLinesOnWords).toList();
    }

    /**
     * Sorts a list of words in a case-insensitive manner.
     *
     * @param splitLinesOnWords A list of words to be sorted.
     * @return A sorted list of words.
     */
    public static List<String> sortWords(List<String> splitLinesOnWords) {
        return splitLinesOnWords.stream().sorted(String::compareToIgnoreCase).toList();
    }

    /**
     * Counts the occurrences of each word in a sorted list and stores them in a map.
     *
     * @param sortedWordsList A list of sorted words for which occurrences will be counted.
     * @return A map where keys are unique words and values are their respective counts.
     */
    public static Map<String, Integer> countWordOccurrences(List<String> sortedWordsList) {
        Map<String, Integer> wordToOccurrences = new TreeMap<>();

        for (String word : sortedWordsList) {
            wordToOccurrences.put(word, wordToOccurrences.getOrDefault(word, 0) + 1);
        }

        return wordToOccurrences;
    }

    /**
     * Creates a new map containing word occurrences sorted in a case-insensitive manner.
     *
     * @param wordToOccurrences A map containing words and their occurrence counts.
     * @return A case-insensitively sorted map of word occurrences.
     */
    public static Map<String, Integer> sortedWordOccurrences(Map<String, Integer> wordToOccurrences) {
        Map<String, Integer> sortedMapWordToOccurrences = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedMapWordToOccurrences.putAll(wordToOccurrences);
        return sortedMapWordToOccurrences;
    }

    /**
     * Formats the sorted word occurrences into a readable string format.
     *
     * @param sortedWordToOccurrences A map of sorted word occurrences to be formatted as a string.
     * @return A formatted string representation of the sorted word occurrences.
     */
    public static String writeOutSortedWordOccurrences(Map<String, Integer> sortedWordToOccurrences) {
        StringBuilder result = new StringBuilder();

        sortedWordToOccurrences.forEach((key, value) -> result
                .append(key)
                .append(" : ")
                .append(value)
                .append("\n"));

        return result.toString();
    }
}
