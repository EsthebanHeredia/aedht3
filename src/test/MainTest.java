package uvg.edu.gt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;

public class MainTest {
    @Test
    void testInsertionSort() {
        // Datos de entrada
        int[] numbers = {2, 1};
        int[] expected = {1, 2};

        // Ejecutar el algoritmo de ordenación
        InsertionSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }

    @Test
    void testBucketSort() {
        // Datos de entrada
        int[] numbers = {15, 6, 3, 9, 12};
        int[] expected = {3, 6, 9, 12, 15};

        // Ejecutar el algoritmo de ordenación
        BucketSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }

    @Test
    void testHeapSort() {
        // Datos de entrada
        int[] numbers = {15, 6, 3, 9, 12};
        int[] expected = {3, 6, 9, 12, 15};

        // Ejecutar el algoritmo de ordenación
        HeapSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }

    @Test
    void testMergeSort() {
        // Datos de entrada
        int[] numbers = {10, 7, 2, 4, 9};
        int[] expected = {2, 4, 7, 9, 10};

        // Ejecutar el algoritmo de ordenación
        MergeSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }

    @Test
    void testQuickSort() {
        // Datos de entrada
        int[] numbers = {15, 6, 3, 9, 12};
        int[] expected = {3, 6, 9, 12, 15};

        // Ejecutar el algoritmo de ordenación
        QuickSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }

    @Test
    void testRadixSort() {
        // Datos de entrada
        int[] numbers = {15, 6, 3, 9, 12};
        int[] expected = {3, 6, 9, 12, 15};

        // Ejecutar el algoritmo de ordenación
        RadixSort.sort(numbers);

        // Comparar el resultado con el esperado
        assertTrue(Arrays.equals(expected, numbers), "El array no fue ordenado correctamente.");
    }
}

