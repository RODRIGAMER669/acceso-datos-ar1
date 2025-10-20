import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transformador_ARR {
    public static void main(String[] args) throws IOException {
        String hojaEstilo = "videojuegosPlantilla.xsl";
        String datosAlumnos = "FicheroXML.xml";
        File pagHTML = new File("mipagina.html");
        FileOutputStream os = new FileOutputStream(pagHTML); // crear fichero HTML

        Source estilos = new StreamSource(hojaEstilo); // fuente XSL
        Source datos = new StreamSource(datosAlumnos); // fuente XML
        Result result = new StreamResult(os);

        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer(estilos);
            transformer.transform(datos, result); // obtiene el HTML
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        os.close(); // cerrar fichero
    }
}
