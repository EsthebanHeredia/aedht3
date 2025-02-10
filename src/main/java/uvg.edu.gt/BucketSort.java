package uvg.edu.gt;

//Comentario para arreglar
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] arr) {
        if (arr.length <= 0) return;

        int minValue = arr[0];
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        // Crear los buckets
        int bucketCount = (maxValue - minValue) / arr.length + 1;
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];

        // Inicializar los buckets
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Colocar elementos en los buckets
        for (int num : arr) {
            int bucketIndex = (num - minValue) / arr.length;
            buckets[bucketIndex].add(num);
        }

        // Ordenar los buckets y devolver los resultados
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }
}