package lt.viko.eif.atalalaite.webserviceclient.services;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lt.viko.eif.atalalaite.webserviceclient.model.Library;
import org.apache.fop.apps.*;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/**
 * Service to convert XML file to different files
 *
 * @author atalalaite
 */
@Service
public class ConvertLibrary {
    /**
     * Converts XML to PDF file using XSL-FO transformation
     * @throws Exception if conversion fails
     */
    public void convertXMLToPDF(Library library) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = context.createMarshaller();

        ByteArrayOutputStream xmlOutput = new ByteArrayOutputStream();
        marshaller.marshal(library, xmlOutput);

        StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(xmlOutput.toByteArray()));

        File xsltFile = new File("librarypdf.xsl");

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
    public void convertXMLToHTML(Library library) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = context.createMarshaller();

        ByteArrayOutputStream xmlOutput = new ByteArrayOutputStream();
        marshaller.marshal(library, xmlOutput);

        StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(xmlOutput.toByteArray()));

        File xsltFile = new File("libraryhtml.xsl");

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

        transformer.transform(
                xmlSource,
                new StreamResult(new File("library.html"))
        );

    }

}