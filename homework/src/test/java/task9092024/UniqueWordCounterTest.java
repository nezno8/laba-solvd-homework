package task9092024;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testSplitOnWords() {
        String toSplit = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod";
        String [] splitWords = toSplit.split("\\s+");
        String [] actual = UniqueWordCounter.splitOnWords(toSplit);
        assertArrayEquals(splitWords, actual);
    }

    @Test
    public void testSortWords() {
        List<String> toBeSorted = List.of(
                "Ala", "has", "cat", "and", "cat", "has", "Ala",
                "Tod", "has", "turtle", "and", "turtle", "has", "Tod");

        List <String> sortedWordsList = List.of(
                "Ala", "Ala", "and", "and", "cat", "cat",
                "has", "has", "has", "has", "Tod", "Tod", "turtle", "turtle");
        List<String> actual = UniqueWordCounter.sortWords(toBeSorted);
        assertEquals(sortedWordsList, actual);
    }

    @Test
    public void testCountWordOccurrences() {
        Map<String, Integer> expectedWordToOccurrences = Map.of(
                "Ala",2,
                "and",2,
                "cat",2,
                "has",4,
                "Tod",2,
                "turtle",2);

        List <String> sortedWordsList = List.of(
                "Ala", "Ala", "and", "and", "cat", "cat",
                "has", "has", "has", "has", "Tod", "Tod", "turtle", "turtle");

        Map actual = UniqueWordCounter.countWordOccurrences(sortedWordsList);
        assertEquals(expectedWordToOccurrences, actual);
    }

    @Test
    public void testSortedWordOccurrences() {
        List<String> expectedKeyOrder = List.of(
                "Ala",
                "and",
                "cat",
                "has",
                "Tod",
                "turtle");
        Map<String, Integer> wordToOccurrences = Map.of(
                "turtle",2,
                "and",2,
                "Ala",2,
                "cat",2,
                "Tod",2,
                "has",4);

        List<String> actual = new ArrayList(UniqueWordCounter.sortedWordOccurrences(wordToOccurrences).keySet());
        assertEquals(expectedKeyOrder, actual);
    }
}
