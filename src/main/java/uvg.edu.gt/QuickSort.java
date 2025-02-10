package uvg.edu.gt;

import java.util.*;

public class QuickSort {
    public static void sort(List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size() - 1);
    }

    private static void quickSort(List<Integer> numbers, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(numbers, low, high);
            quickSort(numbers, low, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, high);
        }
    }

    private static int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                Collections.swap(numbers, i, j);
            }
        }
        Collections.swap(numbers, i + 1, high);
        return i + 1;
    }
}