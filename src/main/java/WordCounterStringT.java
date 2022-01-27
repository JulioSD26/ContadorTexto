import java.io.*;
import java.util.StringTokenizer;

public class WordCounterStringT {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Falta el nombre del archivo");
            System.exit(1);
        }
        String fileName = args[0];

        FileReader fileReader = null;

        try{
            fileReader = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("el nombre del archivo no se encuentra");
            System.exit(2);
        }

        BufferedReader in = new BufferedReader(fileReader);
        StringTokenizer st = new StringTokenizer(in.toString());

        int contadorPalabras = 0;
        int tipoToken = 0;

        while(st.hasMoreTokens()){
            contadorPalabras++;
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Contado de palabras tiene %d palabras", contadorPalabras);
    }
}
