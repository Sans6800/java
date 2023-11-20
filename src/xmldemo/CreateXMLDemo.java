package xmldemo;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CreateXMLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Defines a factory API that enables applications to obtain a parser that produces DOM object trees from XML documents.
        DocumentBuilderFactory myDocBuilderFactory = DocumentBuilderFactory.newInstance();
        // Defines the API to obtain DOM Document instances from an XML document.
        DocumentBuilder myDocBuilder;
        try {
            myDocBuilder = myDocBuilderFactory.newDocumentBuilder();
            // The Document interface represents the entire HTML or XML document.
            Document myDoc = myDocBuilder.newDocument();
            // The Element interface represents an element in an HTML or XML document.
            Element mainRootElement = myDoc.createElementNS("src/xmldemo/", "Companies");
            // Adds the node newChild to the end of the list of children of this node.
            // If the newChild is already in the tree, it is first removed.
            myDoc.appendChild(mainRootElement);
            // append child elements to root element
            mainRootElement.appendChild(getCompany(myDoc, "1", "Paypal", "Payment", "1000"));
            mainRootElement.appendChild(getCompany(myDoc, "2", "Amazon", "Shopping", "2000"));
            mainRootElement.appendChild(getCompany(myDoc, "3", "Google", "Search", "3000"));
            mainRootElement.appendChild(getCompany(myDoc, "4", "my", "Java Tutorials", "10"));
            // output DOM XML to console
            // An instance of this abstract class can transform a source tree into a result tree.
            Transformer myTransformer = TransformerFactory.newInstance().newTransformer();
            myTransformer.setOutputProperty(OutputKeys.INDENT, "yes");
            // Acts as a holder for a transformation Source tree in the form of a Document Object Model (DOM) tree.
            DOMSource source = new DOMSource(myDoc);
            // Acts as an holder for a transformation result, which may be XML, plain Text, HTML, or some other form of markup.
            StreamResult console = new StreamResult(System.out);
            myTransformer.transform(source, console);
            System.out.println(" XML DOM Created Successfully..");
        } catch (TransformerException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
    // The Node interface is the primary datatype for the entire Document Object Model.
    // It represents a single node in the document tree.
    private static Node getCompany(Document doc, String id, String name, String age, String role) {
        Element myCompany = doc.createElement("Company");
        myCompany.setAttribute("id", id);
        myCompany.appendChild(getmyCompanyElements(doc, myCompany, "Name", name));
        myCompany.appendChild(getmyCompanyElements(doc, myCompany, "Type", age));
        myCompany.appendChild(getmyCompanyElements(doc, myCompany, "Employees", role));
        return myCompany;
    }
    // Utility method to create text node
    private static Node getmyCompanyElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}
