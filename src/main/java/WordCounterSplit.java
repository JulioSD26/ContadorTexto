import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCounterSplit {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("falta el nombre del archivo.");
            System.exit(1);
        }
        String fileName = args[0];

        try {
            FileReader fileReader = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
            System.exit(2);
        }

        String [] text = null;
        BufferedReader br = null;
        int contadorPalabras = 0;

        try {
            text

            while(s.hasNext()){
                //System.out.println(s.next());
                contadorPalabras++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            if(s != null){
                s.close();
            }
        }
        System.out.println("Contador tiene: " + contadorPalabras);


    }
}
