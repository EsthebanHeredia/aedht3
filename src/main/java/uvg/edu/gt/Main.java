package uvg.edu.gt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

//comentario para verificar un commit
public class Main {
    public static void main(String[] args) throws IOException {
        // Leer los números del archivo
        List<String> lines = Files.readAllLines(new File("input.txt").toPath());
        int[] numbers = lines.stream().mapToInt(Integer::parseInt).toArray();

        // Crear instancias de los algoritmos de ordenamiento
        RadixSort radixSort = new RadixSort();
        BucketSort bucketSort = new BucketSort();
        HeapSort heapSort = new HeapSort();

        // Medir el tiempo de ejecución de cada algoritmo
        long startTime, endTime;

        // Radix Sort
        startTime = System.nanoTime();
        radixSort.sort(numbers.clone()); // Usamos clone() para evitar modificar el array original
        endTime = System.nanoTime();
        System.out.println("Radix Sort took " + (endTime - startTime) + " nanoseconds.");

        // Bucket Sort
        startTime = System.nanoTime();
        bucketSort.sort(numbers.clone());
        endTime = System.nanoTime();
        System.out.println("Bucket Sort took " + (endTime - startTime) + " nanoseconds.");

        // Heap Sort
        startTime = System.nanoTime();
        heapSort.sort(numbers.clone());
        endTime = System.nanoTime();
        System.out.println("Heap Sort took " + (endTime - startTime) + " nanoseconds.");
    }
}