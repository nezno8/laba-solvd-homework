package task9092024;

import java.util.Arrays;
import java.util.List;

public class UniqueWordCounter {

    public static List<String> splitOnWords(String toSplit) {
    return Arrays.stream(toSplit.split("\\s+")).toList();
    }

    public static List<String> sortWords(List<String> splitLinesOnWords) {
        return splitLinesOnWords.stream().sorted().toList();
    }
}
