import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Tiempo promedio de procesamiento
    880
    661
    670
 */

public class WordCounterSplit {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("falta el nombre del archivo.");
            System.exit(1);
        }
        String fileName = args[0];
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
            System.exit(2);
        }

        BufferedReader in = new BufferedReader(fileReader);

        int contadorPalabras = 0;
        int contadorLineas = 0;
        String linea;

        long start = System.currentTimeMillis();
        try {
            while ((linea = in.readLine()) !=null){
                String[] palabras = linea.split("\\s+");
                contadorPalabras = contadorPalabras + palabras.length;
                contadorLineas++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            System.exit(3);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long time = System.currentTimeMillis() - start;

        System.out.printf("El archivo %s tiene %,7d palabras. " , fileName, contadorPalabras);
        System.out.printf(" Numero de lineas: %,6d%n", contadorLineas);
        System.out.printf("Tiempo procesamiento (milisegundos): %d %n" , time);

    }
}
