import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {
    public static void main(String[] args){
        int[] numbers = new int[3000];
        Random rand = new Random();

        //generación de números es necesario llamar esta clase para cada uno de los algoritmos con los que trabajaremos
        for (int i = 0; i < 3000; i++){
            numbers[i] = rand.nextInt(10000);//Usaremos numeros entre 0 y 9999
        }

        try (FileWriter writer = new FileWriter("input.txt")){
            for(int num: numbers){
                writer.write(num + "\n");
            }
            System.out.println("Archivo de numeros aleatorios generado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
