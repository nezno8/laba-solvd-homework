package task9092024;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordCounter {

    public static String [] splitOnWords(String toSplit) {
        return StringUtils.split(toSplit);
    }

    public static List<String> sortWords(List<String> splitLinesOnWords) {
        return splitLinesOnWords.stream().sorted((w1,w2) -> w1.compareToIgnoreCase(w2)).toList();
    }

    public static Map countWordOccurrences(List<String> sortedWordsList) {
        HashMap<String, Integer> wordToOccurrences = new HashMap<>();
        for (String word : sortedWordsList) {
            wordToOccurrences.put(word, wordToOccurrences.getOrDefault(word, 0) + 1);
        }
        return wordToOccurrences;
    }
}
