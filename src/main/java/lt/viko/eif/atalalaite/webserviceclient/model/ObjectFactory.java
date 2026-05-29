
package lt.viko.eif.atalalaite.webserviceclient.model;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.eif.viko.atalalaite.webserviceclient package. 
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

    private static final QName _Exception_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "Exception");
    private static final QName _AddBook_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "addBook");
    private static final QName _AddBookResponse_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "addBookResponse");
    private static final QName _Book_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "book");
    private static final QName _GetBookByIsbn_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getBookByIsbn");
    private static final QName _GetBookByIsbnResponse_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getBookByIsbnResponse");
    private static final QName _GetLibraryDetails_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getLibraryDetails");
    private static final QName _GetLibraryDetailsResponse_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "getLibraryDetailsResponse");
    private static final QName _Library_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "library");
    private static final QName _RemoveBook_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "removeBook");
    private static final QName _RemoveBookResponse_QNAME = new QName("http://services.webservice.atalalaite.viko.eif.lt/", "removeBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.eif.viko.atalalaite.webserviceclient
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
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     * @return
     *     the new instance of {@link AddBook }
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     * @return
     *     the new instance of {@link AddBookResponse }
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
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
     * Create an instance of {@link GetBookByIsbn }
     * 
     * @return
     *     the new instance of {@link GetBookByIsbn }
     */
    public GetBookByIsbn createGetBookByIsbn() {
        return new GetBookByIsbn();
    }

    /**
     * Create an instance of {@link GetBookByIsbnResponse }
     * 
     * @return
     *     the new instance of {@link GetBookByIsbnResponse }
     */
    public GetBookByIsbnResponse createGetBookByIsbnResponse() {
        return new GetBookByIsbnResponse();
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
     * Create an instance of {@link RemoveBook }
     * 
     * @return
     *     the new instance of {@link RemoveBook }
     */
    public RemoveBook createRemoveBook() {
        return new RemoveBook();
    }

    /**
     * Create an instance of {@link RemoveBookResponse }
     * 
     * @return
     *     the new instance of {@link RemoveBookResponse }
     */
    public RemoveBookResponse createRemoveBookResponse() {
        return new RemoveBookResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIsbn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByIsbn }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "getBookByIsbn")
    public JAXBElement<GetBookByIsbn> createGetBookByIsbn(GetBookByIsbn value) {
        return new JAXBElement<>(_GetBookByIsbn_QNAME, GetBookByIsbn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIsbnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookByIsbnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "getBookByIsbnResponse")
    public JAXBElement<GetBookByIsbnResponse> createGetBookByIsbnResponse(GetBookByIsbnResponse value) {
        return new JAXBElement<>(_GetBookByIsbnResponse_QNAME, GetBookByIsbnResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "removeBook")
    public JAXBElement<RemoveBook> createRemoveBook(RemoveBook value) {
        return new JAXBElement<>(_RemoveBook_QNAME, RemoveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.webservice.atalalaite.viko.eif.lt/", name = "removeBookResponse")
    public JAXBElement<RemoveBookResponse> createRemoveBookResponse(RemoveBookResponse value) {
        return new JAXBElement<>(_RemoveBookResponse_QNAME, RemoveBookResponse.class, null, value);
    }

}
