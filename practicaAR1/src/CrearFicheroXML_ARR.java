import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class CrearFicheroXML_ARR {
    public static void main(String[] args) {
        File archivo = new File("Fichero.dat");

        try (RandomAccessFile file = new RandomAccessFile(archivo, "r")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Videojuegos", null);
            document.setXmlVersion("1.0");

            long posicion = 0; // inicio del archivo

            while (posicion < file.length()) {
                file.seek(posicion); 

                int codigo = file.readInt();
                String nombre = file.readUTF();
                String genero = file.readUTF();
                float precio = file.readFloat();
                char acabado = file.readChar();

                System.out.println("id: " + codigo + ", nombre: " + nombre + ", genero: " + genero +
                                   ", precio: " + precio + ", acabado: " + acabado);

                Element videojuego = document.createElement("videojuego");
                document.getDocumentElement().appendChild(videojuego);

                CrearElemento("id", Integer.toString(codigo), videojuego, document);
                CrearElemento("nombre", nombre, videojuego, document);
                CrearElemento("genero", genero, videojuego, document);
                CrearElemento("precio", Float.toString(precio), videojuego, document);
                CrearElemento("acabado", Character.toString(acabado), videojuego, document);

                // actualizamos la posición al final del registro leído
                posicion = file.getFilePointer();
            }

            // Guardar el XML en fichero
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            Source source = new DOMSource(document);
            Result result = new StreamResult(new File("FicheroXML.xml"));
            transformer.transform(source, result);

            // Mostrar XML por consola
            transformer.transform(source, new StreamResult(System.out));

        } catch (EOFException e) {
            System.out.println("Fin del archivo alcanzado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void CrearElemento(String etiqueta, String valor, Element raiz, Document document) {
        Element elem = document.createElement(etiqueta);
        Text text = document.createTextNode(valor);
        raiz.appendChild(elem);
        elem.appendChild(text);
    }
}
