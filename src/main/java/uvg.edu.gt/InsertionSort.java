package uvg.edu.gt;

public class InsertionSort {
    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            int key = numbers.get(i);
            int j = i - 1;
            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }
            numbers.set(j + 1, key);
        }
    }
}