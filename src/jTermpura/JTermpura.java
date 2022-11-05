package jTermpura;

/**
 * @author swaritchoudhari
 *
 */

public class JTermpura {
	
	public final static String logo = ""
			+ "███████████  ████                       █████     \r\n"
			+ "░░███░░░░░███░░███                      ░░███      \r\n"
			+ " ░███    ░███ ░███   ██████   ████████   ░███ █████\r\n"
			+ " ░██████████  ░███  ░░░░░███ ░░███░░███  ░███░░███ \r\n"
			+ " ░███░░░░░███ ░███   ███████  ░███ ░███  ░██████░  \r\n"
			+ " ░███    ░███ ░███  ███░░███  ░███ ░███  ░███░░███ \r\n"
			+ " ███████████  █████░░████████ ████ █████ ████ █████\r\n"
			+ "░░░░░░░░░░░  ░░░░░  ░░░░░░░░ ░░░░ ░░░░░ ░░░░ ░░░░░ ";
	   // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
  
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";

	public static void main(String[] args) {
		System.out.println(ANSI_YELLOW + "Hi" + ANSI_RESET);

	}

}
