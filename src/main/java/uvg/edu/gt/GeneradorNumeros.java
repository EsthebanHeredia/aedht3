package uvg.edu.gt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {
    public static void main(String[] args) {
        int[] numbers = new int[3000];
        Random rand = new Random();

        // Generación de números aleatorios entre 0 y 9999
        for (int i = 0; i < 3000; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        // Usar BufferedWriter para mejorar la escritura en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"))) {
            for (int num : numbers) {
                writer.write(num + "\n");  // Escribir cada número en una nueva línea
            }
            System.out.println("Archivo de números aleatorios generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al generar el archivo de números aleatorios: " + e.getMessage());
            e.printStackTrace();
        }
    }
}