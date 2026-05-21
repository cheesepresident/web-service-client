
package lt.eif.viko.atalalaite.webservice.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.eif.viko.atalalaite.webservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Book_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "book");
    private static final QName _GetLibraryDetails_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getLibraryDetails");
    private static final QName _GetLibraryDetailsResponse_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getLibraryDetailsResponse");
    private static final QName _Library_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "library");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.eif.viko.atalalaite.webservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Library }
     * 
     * @return
     *     the new instance of {@link Library }
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link Book }
     * 
     * @return
     *     the new instance of {@link Book }
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link GetLibraryDetails }
     * 
     * @return
     *     the new instance of {@link GetLibraryDetails }
     */
    public GetLibraryDetails createGetLibraryDetails() {
        return new GetLibraryDetails();
    }

    /**
     * Create an instance of {@link GetLibraryDetailsResponse }
     * 
     * @return
     *     the new instance of {@link GetLibraryDetailsResponse }
     */
    public GetLibraryDetailsResponse createGetLibraryDetailsResponse() {
        return new GetLibraryDetailsResponse();
    }

    /**
     * Create an instance of {@link Library.Books }
     * 
     * @return
     *     the new instance of {@link Library.Books }
     */
    public Library.Books createLibraryBooks() {
        return new Library.Books();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Book }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibraryDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLibraryDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "getLibraryDetails")
    public JAXBElement<GetLibraryDetails> createGetLibraryDetails(GetLibraryDetails value) {
        return new JAXBElement<>(_GetLibraryDetails_QNAME, GetLibraryDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibraryDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLibraryDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "getLibraryDetailsResponse")
    public JAXBElement<GetLibraryDetailsResponse> createGetLibraryDetailsResponse(GetLibraryDetailsResponse value) {
        return new JAXBElement<>(_GetLibraryDetailsResponse_QNAME, GetLibraryDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Library }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Library }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "library")
    public JAXBElement<Library> createLibrary(Library value) {
        return new JAXBElement<>(_Library_QNAME, Library.class, null, value);
    }

}
