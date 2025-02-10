package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MainTest {
    @Test
    void testInsertionSort() {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 8);
        InsertionSort.sort(numbers);
        assertEquals(expected, numbers);
    }

    @Test
    void testMergeSort() {
        List<Integer> numbers = Arrays.asList(10, 7, 2, 4, 9);
        List<Integer> expected = Arrays.asList(2, 4, 7, 9, 10);
        MergeSort.sort(numbers);
        assertEquals(expected, numbers);
    }

    @Test
    void testQuickSort() {
        List<Integer> numbers = Arrays.asList(15, 6, 3, 9, 12);
        List<Integer> expected = Arrays.asList(3, 6, 9, 12, 15);
        QuickSort.sort(numbers);
        assertEquals(expected, numbers);
    }
    
}
