import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class FicheroXml {
	
	// Nuestro fichero para guardar y leer
	public static File fichero = new File("settings.xml");
	public static DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	
	
	private static void crearXML() throws Exception {
		DocumentBuilder db = dbf.newDocumentBuilder();
		 
		// Donde Guardaremos.
		Document doc = db.newDocument();
		Element principal = doc.createElement("elementoPrincipal");
		doc.appendChild(principal);  		
		
		Element secundario1 = doc.createElement("elementoSecundario");
		Text textNode1 = doc.createTextNode("Texto de Elemento Secundario 1");
		secundario1.appendChild(textNode1);
		principal.appendChild(secundario1);
		
		Element secundario2 = doc.createElement("elementoSecundario");
		Text textNode2 = doc.createTextNode("Texto de Elemento Secundario 1");
		secundario2.appendChild(textNode2);
		principal.appendChild(secundario2);
		
		Element secundario3 = doc.createElement("elementoSecundario");
		Text textNode3 = doc.createTextNode("Texto de Elemento Secundario 1");
		secundario3.appendChild(textNode3);
		principal.appendChild(secundario3);
		
		
		// Guardar en el file
		// ===============================
		  
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		// Transforma el Document en XML
		DOMSource origen = new DOMSource(doc);		  
		// Genera el destino File
		StreamResult destino = new StreamResult(fichero);		 
		// Guarda el Origen en Destino
		transformer.transform(origen, destino);
	}

	
	private static void leerXml() throws Exception {
 
		DocumentBuilder db = dbf.newDocumentBuilder();
		  
		// Donde guardaremos todo - Nuesto RootFile
		Document doc = db.parse(fichero); 
		
	}
	
	
	public static void main( String[] args ) throws Exception {
		
		
		// Crear un XML
		FicheroXml.crearXML();
		// Leer un XMl
		FicheroXml.leerXml();
	} 
}
