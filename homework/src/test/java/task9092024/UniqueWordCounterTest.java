package task9092024;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testSplitOnWords() {
        String toSplit = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod";
        List<String> expected = List.of(
                "Ala", "has", "cat", "and", "cat", "has", "Ala",
                "Tod", "has", "turtle", "and", "turtle", "has", "Tod");
        List<String> actual = UniqueWordCounter.splitOnWords(toSplit);
        assertEquals(expected, actual);
    }

    @Test
    public void testSortWords() {
        List<String> toBeSorted = List.of(
                "Ala", "has", "cat", "and", "cat", "has", "Ala",
                "Tod", "has", "turtle", "and", "turtle", "has", "Tod");
        List <String> sortedWordsList = List.of(
                "Ala", "Ala", "Tod", "Tod", "and", "and", "cat", "cat",
                "has", "has", "has", "has", "turtle", "turtle");
        List<String> actualOutput = UniqueWordCounter.sortWords(toBeSorted);
        assertEquals(sortedWordsList, actualOutput);
    }
}
