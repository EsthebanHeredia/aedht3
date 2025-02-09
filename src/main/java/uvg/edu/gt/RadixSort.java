import java.util.Arrays;

public class RadixSort {
    public void sort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt(); // Encuentra el número máximo

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private void countingSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        // Contar la frecuencia de los dígitos
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Acumular los valores
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Colocar los elementos en la posición correcta
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}