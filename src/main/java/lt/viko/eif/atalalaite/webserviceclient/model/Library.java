
package lt.viko.eif.atalalaite.webserviceclient.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for library complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="library">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hasReadingRoom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="books" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="book" type="{http://services.webservice.atalalaite.viko.eif.lt/}book" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "library", propOrder = {
    "name",
    "location",
    "city",
    "hasReadingRoom",
    "books"
})
public class Library {

    protected String name;
    protected String location;
    protected String city;
    protected boolean hasReadingRoom;
    protected Library.Books books;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the hasReadingRoom property.
     * 
     */
    public boolean isHasReadingRoom() {
        return hasReadingRoom;
    }

    /**
     * Sets the value of the hasReadingRoom property.
     * 
     */
    public void setHasReadingRoom(boolean value) {
        this.hasReadingRoom = value;
    }

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link Library.Books }
     *     
     */
    public Library.Books getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link Library.Books }
     *     
     */
    public void setBooks(Library.Books value) {
        this.books = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="book" type="{http://services.webservice.atalalaite.viko.eif.lt/}book" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "book"
    })
    public static class Books {

        protected List<Book> book;

        /**
         * Gets the value of the book property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the book property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBook().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Book }
         * 
         * 
         * @return
         *     The value of the book property.
         */

        @Override
        public String toString() {
            return "Books{" +
                    "book=" + book +
                    '}';
        }
        public List<Book> getBook() {
            if (book == null) {
                book = new ArrayList<>();
            }
            return this.book;
        }

    }
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", city='" + city + '\'' +
                ", hasReadingRoom=" + hasReadingRoom +
                ", books=" + books +
                '}';
    }

}
