package task9092024;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class UniqueWordCounter {

    public static String [] splitOnWords(String toSplit) {
        return StringUtils.split(toSplit);
    }

    public static List<String> splitOnWordsAsList(String toSplit) {
        return Arrays.stream(StringUtils.split(toSplit)).toList();
    }

    public static List<String> sortWords(List<String> splitLinesOnWords) {
        return splitLinesOnWords.stream().sorted((w1,w2) -> w1.compareToIgnoreCase(w2)).toList();
    }

    public static Map countWordOccurrences(List<String> sortedWordsList) {
        Map <String, Integer> wordToOccurrences = new TreeMap<>();
        for (String word : sortedWordsList) {
            wordToOccurrences.put(word, wordToOccurrences.getOrDefault(word, 0) + 1);
        }
        return wordToOccurrences;
    }

    public static Map sortedWordOccurrences(Map<String, Integer> wordToOccurrences) {
        Map<String, Integer> sortedMapWordToOccurrences = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        sortedMapWordToOccurrences.putAll(wordToOccurrences);
        return sortedMapWordToOccurrences;
    }

    public static String writeOutSortedWordOccurrences(TreeMap<String, Integer> sortedWordToOccurrences) {
        TreeMap<String, Integer> sortedWordToOccurrences2 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        StringBuilder result = new StringBuilder();
        sortedWordToOccurrences2.putAll(sortedWordToOccurrences);
        sortedWordToOccurrences2.forEach((key, value) -> result.append(key).append(" : ").append(value).append(";\n"));
        return result.toString();
    }
}
