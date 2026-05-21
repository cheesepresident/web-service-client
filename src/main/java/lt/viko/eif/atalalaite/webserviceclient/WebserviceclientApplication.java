package lt.viko.eif.atalalaite.webserviceclient;

import lt.eif.viko.atalalaite.webservice.client.Library;
import lt.eif.viko.atalalaite.webservice.client.LibraryServiceImplService;
import lt.eif.viko.atalalaite.webservice.client.LibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceclientApplication.class, args);
	}{
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
	}
}
