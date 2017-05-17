import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParceurBacteria {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance() ;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document Doc = builder.parse("ProjetFiles/Bacteria/aae_Aquifex_aeolicus/path_aae00020.kgml");
			
			NodeList EntryList = Doc.getElementsByTagName("entry");
			System.out.println(	EntryList.getLength());
			for(int i = 0; i < EntryList.getLength(); i++){
				
				Node subEntry = EntryList.item(i);
				if (subEntry.getNodeType() == Node.ELEMENT_NODE){
					
					Element entry = (Element) subEntry;
					String id = entry.getAttribute("id");
					String name = entry.getAttribute("name");
					String gene = entry.getAttribute("type");
					String reaction = entry.getAttribute("reaction");
					String link = entry.getAttribute("link");
					System.out.println("id: "+ id+" name: "+name+" gene: "+ gene + " reaction: "
							+reaction+" link: "+link);
				}
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
