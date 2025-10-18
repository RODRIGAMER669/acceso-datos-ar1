import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;


public class CrearFichero_ARR {
    public static void main(String[] args) throws Exception {
        File file = new File("practicaAR1/src/Ficheros/Fichero.dat");
        FileOutputStream fileOut = new FileOutputStream(file);
        DataOutputStream dataOS = new DataOutputStream(fileOut);

        int[] codigo = {1,2,3,4,5};
        String[] nombre = {"Overwatch", "Fortnite", "God of War", "Valorant", "Minecraft"};
        String[] genero = {"Heroe Shooter","Battle Royale", "Singleplayer", "Tactical Shooter", "Sandbox"};
        Float[] precio = {0f, 0f, 60f, 0f, 30f};
        char[] acabado = {'S','S','N','N', 'S'};

        for(int i = 0; i<5;i++){
            
            dataOS.writeInt(codigo[i]);
            dataOS.writeUTF(nombre[i]);
            dataOS.writeUTF(genero[i]);
            dataOS.writeFloat(precio[i]);
            dataOS.writeChar(acabado[i]);
        }
        dataOS.close();
    }
}
