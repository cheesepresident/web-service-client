package lt.eif.viko.atalalaite.webservice.client.menu;

import lt.eif.viko.atalalaite.webservice.client.Library;
import lt.eif.viko.atalalaite.webservice.client.LibraryService;
import lt.eif.viko.atalalaite.webservice.client.LibraryServiceImplService;
import lt.eif.viko.atalalaite.webservice.client.services.ConvertLibrary;

import java.util.Scanner;

/**
 * Console based user menu to interact with library service
 * the menu can:
 * <ul>
 *     <li>Start Library web service</li>
 *     <li>Print XML file to PDF</li>
 *     <li>Print XML file to HTML</li>
 *     <li>Exit the application</li>
 * </ul>
 * @author atalalaite
 */
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
                "1. Start Library web service\n" +
                "2. Print to PDF\n" +
                "3. Print to HTML\n" +
                "4. QUIT");
        return input.nextInt();
    }

    /**
     * Depending on user choice does the method:
     * <ul>
     *       <li>Get library data</li>
     *       <li>Print XML file to PDF</li>
     *       <li>Print XML file to HTML</li>
     *       <li>Exit the application</li>
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

                        LibraryServiceImplService locator = new LibraryServiceImplService();

                        LibraryService client = locator.getLibraryServiceImplPort();

                        Library library = client.getLibraryDetails();

                        if (library != null) {
                            System.out.println("Received library data");

                            System.out.println("Library Object: " + library.toString());

                        } else {
                            System.out.println("Library is null");
                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 2:
                    convertLibrary.convertXMLToPDF();
                    break;
                case 3:
                    convertLibrary.convertXMLToHTML();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (userChoice!=0);
    }
}
