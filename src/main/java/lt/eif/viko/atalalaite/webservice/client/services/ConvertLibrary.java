package lt.eif.viko.atalalaite.webservice.client.services;

import org.apache.fop.apps.*;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Service to convert XML file to different files
 *
 * @author atalalaite
 */
public class ConvertLibrary {
    /**
     * Converts XML to PDF file using XSL-FO transformation
     * @throws Exception if conversion fails
     */
    public void convertXMLToPDF() throws Exception {

        File xsltFile = new File("librarypdf.xsl");
        StreamSource xmlSource = new StreamSource(new File("library.xml"));

        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        OutputStream out = new FileOutputStream("library.pdf");

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            Result res = new SAXResult(fop.getDefaultHandler());

            transformer.transform(xmlSource, res);

        } finally {
            out.close();
        }
    }

    /**
     * Converts XML to HTML file using XSLT transformation
     * @throws Exception if conversion fails
     */
    public void convertXMLToHTML() throws Exception {

        File xmlFile = new File("library.xml");
        File xsltFile = new File("libraryhtml.xsl");

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

        transformer.transform(
                new StreamSource(xmlFile),
                new StreamResult(new File("library.html"))
        );

    }

}