package uvg.edu.gt;

import java.util.*;

public class MergeSort {
    public static void sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int[] leftPart = Arrays.copyOfRange(numbers, left, mid + 1);
        int[] rightPart = Arrays.copyOfRange(numbers, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < leftPart.length && j < rightPart.length) {
            if (leftPart[i] <= rightPart[j]) {
                numbers[k++] = leftPart[i++];
            } else {
                numbers[k++] = rightPart[j++];
            }
        }
        while (i < leftPart.length) numbers[k++] = leftPart[i++];
        while (j < rightPart.length) numbers[k++] = rightPart[j++];
    }
}