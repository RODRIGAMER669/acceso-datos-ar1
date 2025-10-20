/* Plnatilla:
 *  cd practicaAR1\src
 * javac  ModificarFichero_ARR
 * java ModificarFichero_ARR 1 Patata Sandbox 10 S
 * 
 */


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ModificarFichero_ARR {

    public static void main(String[] args) {
        File file = new File("../../Fichero.dat");
        int id = Integer.parseInt(args[0]);
        String nombre = args[1];
        String genero = args[2];
        float precio = Float.parseFloat(args[3]);
        char acabado = args[4].charAt(0);

        int registroTamano = 4 + 40 + 40 + 4 + 2;

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            long posicion = (id - 1) * registroTamano;

            if (posicion >= raf.length()) {
                System.out.println("No existe ningún registro con id " + id);
                return;
            }

            // Posicionar el puntero
            raf.seek(posicion);

            // Escribir datos nuevos
            raf.writeInt(id);

            StringBuffer buffer = new StringBuffer(nombre);
            buffer.setLength(20);
            raf.writeChars(buffer.toString());

            buffer = new StringBuffer(genero);
            buffer.setLength(20);
            raf.writeChars(buffer.toString());

            raf.writeFloat(precio);
            raf.writeChar(acabado);

        } catch (IOException e) {
            System.out.println("Error accediendo al fichero: " + e.getMessage());
        }
    }
}
