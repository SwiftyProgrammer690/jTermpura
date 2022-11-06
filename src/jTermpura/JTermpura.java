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
	
	public final static String description = "Create delicious Terminal UIs without the culinary classes.\r\n"
			+ "\r\n"
			+ "With Termpura you can craft up an interface in your terminal using a quick-and-simple framework built with developers in mind. Termpura improves productivity and allows anyone to get off on a running start on their next great project.\r\n"
			+ "\r\n"
			+ "With Termpura on Replit you can start coding in an amazing IDE with all the features you need setup! Just start typing away and hit that run button.\r\n"
			+ "\r\n"
			+ "Termpura features:\r\n"
			+ "\r\n"
			+ " - File-based pages and routing.\r\n"
			+ " - Functional handler and router system.\r\n"
			+ " - Programmable middleware that can be used for authentication, displays, and more.\r\n"
			+ " - Intuitive, dev-friendly environment (especially for those who are familiar with\r\n"
			+ " frameworks like NextJS).\r\n"
			+ " - and more! 🎉";

	// TODO complete basics of main page
	public static void mainPage() {
		System.out.println(logo);
		System.out.println("\n\n");
		System.out.println(description);
	};
	
	// TODO complete 404 pages
	public static void notFound404Error(String notFoundLogo) {
		System.out.println(notFoundLogo);
	};
	
	// TODO comple 500 pages
	public static void internalServer505Error(String internalServerErrLogo) {
		System.out.println(internalServerErrLogo);
	};

	public static void main(String[] args) {
		mainPage();
	};

}
