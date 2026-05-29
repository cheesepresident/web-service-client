package lt.viko.eif.atalalaite.webserviceclient.menu;

import lt.viko.eif.atalalaite.webserviceclient.model.Book;
import lt.viko.eif.atalalaite.webserviceclient.model.Library;
import lt.viko.eif.atalalaite.webserviceclient.services.ConvertLibrary;
import lt.viko.eif.atalalaite.webserviceclient.services.LibraryService;
import lt.viko.eif.atalalaite.webserviceclient.services.LibraryServiceImplService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Console based user menu to interact with library service
 * the menu can:
 * <ul>
 *     <li>Get library details</li>
 *     <li>Get book by ISBN</li>
 *     <li>Add book</li>
 *     <li>Remove book by ISBN</li>
 *     <li>Print XML file to PDF</li>
 *     <li>Print XML file to HTML</li>
 *     <li>Exit the application</li>
 * </ul>
 * @author atalalaite
 */
@Component
public class UserMenu {
    /**
     * Service that converts XML library to PDF and HTML
     */
    private ConvertLibrary convertLibrary = new ConvertLibrary();

    /**
     * Displays menu and reads user choice
     * @param input
     * @return selected menu option
     */
    private int displayMenu(Scanner input){
        System.out.println("Make a selection:\n" +
                "1. Get library details\n" +
                "2. Get book by ISBN\n"+
                "3. Add book\n" +
                "4. Remove book by ISBN\n" +
                "5. Print to PDF\n" +
                "6. Print to HTML\n" +
                "7. QUIT");
        return input.nextInt();
    }

    /**
     * Depending on user choice does the method:
     * <ul>
     *     <li>Get library details</li>
     *     <li>Get book by ISBN</li>
     *     <li>Add book</li>
     *     <li>Remove book by ISBN</li>
     *     <li>Print XML file to PDF</li>
     *     <li>Print XML file to HTML</li>
     *     <li>Exit the application</li>
     * </ul>
     * @throws Exception
     */
    public void showMenu() throws Exception {
        Scanner input = new Scanner(System.in);
        int userChoice;
        do{
            userChoice = displayMenu(input);
            switch (userChoice){
                case 1:
                    try {
                        Library library = getLibrary();

                        if (library != null) {
                            System.out.println("Received library data");

                            System.out.println("Library Object: " + library.toString());

                        } else {
                            System.out.println("Library is null");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: {
                    try {
                        System.out.print("Enter ISBN: ");
                        String isbn = input.next();

                        LibraryServiceImplService locator = new LibraryServiceImplService();

                        LibraryService client = locator.getLibraryServiceImplPort();

                        Book book = client.getBookByIsbn(isbn);

                        if (book != null) {
                            System.out.println("Book found: " + book);
                        } else {
                            System.out.println("Book not found");
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3: {
                    try {
                        System.out.print("Enter ISBN: ");
                        String isbn = input.next();

                        input.nextLine(); // clear buffer

                        System.out.print("Enter title: ");
                        String title = input.nextLine();

                        System.out.print("Enter author: ");
                        String author = input.nextLine();

                        System.out.print("Enter year: ");
                        int year = input.nextInt();


                        Book book = new Book();
                        book.setIsbn(isbn);
                        book.setTitle(title);
                        book.setAuthor(author);
                        book.setYear(year);

                        LibraryServiceImplService locator = new LibraryServiceImplService();

                        LibraryService client = locator.getLibraryServiceImplPort();

                        String result = client.addBook(book);

                        System.out.println(result);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4: {
                    try {
                        System.out.print("Enter ISBN: ");
                        String isbn = input.next();

                        LibraryServiceImplService locator =
                                new LibraryServiceImplService();

                        LibraryService client =
                                locator.getLibraryServiceImplPort();

                        String result = client.removeBook(isbn);

                        System.out.println(result);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5:
                    try {
                        Library library = getLibrary();
                        convertLibrary.convertXMLToPDF(library);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try {
                        Library library = getLibrary();
                        convertLibrary.convertXMLToHTML(library);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        }while (userChoice!=0);
    }

    private Library getLibrary() throws Exception {

        LibraryServiceImplService locator =
                new LibraryServiceImplService();

        LibraryService client =
                locator.getLibraryServiceImplPort();

        return client.getLibraryDetails();
    }

}
