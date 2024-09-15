package task9092024;

import org.junit.jupiter.api.Test;

import java.util.List;

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
}
