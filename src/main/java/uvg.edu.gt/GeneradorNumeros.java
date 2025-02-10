//TESTEOS CON NUMEROS DESORDENADOS
package uvg.edu.gt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
//Comentario para arreglar
public class GeneradorNumeros {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Generación de números aleatorios entre 0 y 9999
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        // Definir la ruta donde se guardará el archivo
        String filePath = "src/main/resources/input.txt";

        // Crear la carpeta si no existe
        File file = new File(filePath);
        file.getParentFile().mkdirs();  // Crea la carpeta si no existe

        // Escribir los números en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int num : numbers) {
                writer.write(num + "\n");
            }
            System.out.println("Archivo generado correctamente en: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al generar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


//TESTEOS CON NUMEROS ORDENADOS
//package uvg.edu.gt;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Random;
//
//public class GeneradorNumeros {
//    public static void main(String[] args) {
//        int[] numbers = new int[10];  // Genera hasta 3000 números
//        Random rand = new Random();
//
//        // Generación de números aleatorios entre 0 y 9999
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = rand.nextInt(10000);
//        }
//
//        // Ordenar los números en orden ascendente
//        Arrays.sort(numbers);
//
//        // Definir la ruta donde se guardará el archivo
//        String filePath = "src/main/resources/input.txt";
//
//        // Crear la carpeta si no existe
//        File file = new File(filePath);
//        file.getParentFile().mkdirs();  // Crea la carpeta si no existe
//
//        // Escribir los números en el archivo
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//            for (int num : numbers) {
//                writer.write(num + "\n");
//            }
//            System.out.println("Archivo generado correctamente en: " + file.getAbsolutePath());
//        } catch (IOException e) {
//            System.err.println("Error al generar el archivo: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}
//
