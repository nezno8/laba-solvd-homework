package task9092024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordCounter {

    public static List<String> splitLinesOnWords(List<String> linesFromFile) {
    return linesFromFile
            .stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .collect(Collectors.toList());
    }
}
