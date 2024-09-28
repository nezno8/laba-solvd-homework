package task9092024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueWordCounterTest {

    @Test
    public void testSplitOnWords() {
        //Given:
        String toSplit = "Ala has cat and cat has Ala\nTod has turtle and turtle has Tod";
        String [] expected = {
                "Ala", "has", "cat", "and", "cat", "has", "Ala",
                "Tod", "has", "turtle", "and", "turtle", "has", "Tod"};
        //When
        String [] actual = UniqueWordCounter.splitOnWords(toSplit);
        //Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortWords() {
        //Given
        List<String> toBeSorted = List.of(
                "Ala", "has", "cat", "and", "cat", "has", "Ala",
                "Tod", "has", "turtle", "and", "turtle", "has", "Tod");
        List <String> expected = List.of(
                "Ala", "Ala", "and", "and", "cat", "cat",
                "has", "has", "has", "has", "Tod", "Tod", "turtle", "turtle");
        //When
        List<String> actual = UniqueWordCounter.sortWords(toBeSorted);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWordOccurrences() {
        //Given
        List <String> sortedWordsList = List.of(
                "Ala", "Ala", "and", "and", "cat", "cat",
                "has", "has", "has", "has", "Tod", "Tod", "turtle", "turtle");
        Map<String, Integer> expected = Map.of(
                "Ala",2,
                "and",2,
                "cat",2,
                "has",4,
                "Tod",2,
                "turtle",2);
        //When
        Map <String, Integer> actual = UniqueWordCounter.countWordOccurrences(sortedWordsList);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSortedWordOccurrencesAlphabetical() {
        //Given
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("Ala",2);
        expected.put("and",2);
        expected.put("cat",2);
        expected.put("has",4);
        expected.put("Tod",2);
        expected.put("turtle",2);

        Map<String, Integer> toBeSorted = Map.of(
                "turtle",2,
                "and",2,
                "Ala",2,
                "cat",2,
                "Tod",2,
                "has",4);
        //When
        Map<String, Integer> actual = UniqueWordCounter.sortedWordOccurrences(toBeSorted);
        //Then
        assertOrderedMapsEquals(expected, actual);
    }

    public static <K,V> void assertOrderedMapsEquals(Map <K,V> map1, Map <K,V> map2) {
        List<K> list1 = new ArrayList<>();
        List<K> list2 = new ArrayList<>();
        map1.forEach((k,v) -> list1.add(k));
        map2.forEach((k,v) -> list2.add(k));
        assertEquals(map1,map2);
        assertEquals(list1,list2);
    }
}
