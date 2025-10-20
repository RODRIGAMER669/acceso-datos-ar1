import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

public class LeerFicheroXML_ARR {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            GestionContenido gestor = new GestionContenido();
            parser.parse("FicheroXML.xml", gestor);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
