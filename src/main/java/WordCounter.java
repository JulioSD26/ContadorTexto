import java.io.*;

public class WordCounter {
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

        StreamTokenizer st = new StreamTokenizer(in);

        String textLine = null;
        int contadorPalabras = 0;
        int tipoToken = 0;

        long start = System.currentTimeMillis();

        try{
            while((tipoToken = st.nextToken()) != StreamTokenizer.TT_EOF){
                if(tipoToken == StreamTokenizer.TT_WORD){
                    contadorPalabras++;
                }
            }
        } catch (IOException e) {
            System.out.println("error al leer el archivo de entrada");
            System.exit(3);
        }finally{
            try{
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        long time = System.currentTimeMillis() - start;

        System.out.printf("El archivo %s tiene %,7d palabras. ", fileName, contadorPalabras);
        System.out.printf(" Numero de lineas: %,6d%n", st.lineno());
        System.out.printf("tiempo procesamiento(milisegundos): %d %n", time);

    }
}
