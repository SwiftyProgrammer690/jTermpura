package jTermpura;

/**
 * @author swaritchoudhari
 *
 */

public class JTermpura {
	
	// Customize the logo to your needs...
	public final static String logo = ""
			+ "███████████  ████                       █████     \r\n"
			+ "░░███░░░░░███░░███                      ░░███      \r\n"
			+ " ░███    ░███ ░███   ██████   ████████   ░███ █████\r\n"
			+ " ░██████████  ░███  ░░░░░███ ░░███░░███  ░███░░███ \r\n"
			+ " ░███░░░░░███ ░███   ███████  ░███ ░███  ░██████░  \r\n"
			+ " ░███    ░███ ░███  ███░░███  ░███ ░███  ░███░░███ \r\n"
			+ " ███████████  █████░░████████ ████ █████ ████ █████\r\n"
			+ "░░░░░░░░░░░  ░░░░░  ░░░░░░░░ ░░░░ ░░░░░ ░░░░ ░░░░░ ";

	// TODO complete basics of main page
	public static void mainPage() {
		System.out.println(logo);
		System.out.println("\n\n");
	}
	
	// TODO complete 404 pages
	public static void notFound404Error(String notFoundLogo) {
		
	}

	public static void main(String[] args) {
		mainPage();
	}

}
