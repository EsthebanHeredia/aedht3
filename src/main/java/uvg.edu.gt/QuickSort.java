package uvg.edu.gt;

import java.util.*;

public class QuickSort {
    public static void sort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(numbers, low, high);
            quickSort(numbers, low, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i++;
                swap(numbers, i, j);
            }
        }
        swap(numbers, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}