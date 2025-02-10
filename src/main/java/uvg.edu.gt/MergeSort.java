package uvg.edu.gt;

import java.util.*;

public class MergeSort {
    public static void sort(List<Integer> numbers) {
        mergeSort(numbers, 0, numbers.size() - 1);
    }

    private static void mergeSort(List<Integer> numbers, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }

    private static void merge(List<Integer> numbers, int left, int mid, int right) {
        List<Integer> leftPart = new ArrayList<>(numbers.subList(left, mid + 1));
        List<Integer> rightPart = new ArrayList<>(numbers.subList(mid + 1, right + 1));

        int i = 0, j = 0, k = left;
        while (i < leftPart.size() && j < rightPart.size()) {
            if (leftPart.get(i) <= rightPart.get(j)) {
                numbers.set(k++, leftPart.get(i++));
            } else {
                numbers.set(k++, rightPart.get(j++));
            }
        }
        while (i < leftPart.size()) numbers.set(k++, leftPart.get(i++));
        while (j < rightPart.size()) numbers.set(k++, rightPart.get(j++));
    }
}