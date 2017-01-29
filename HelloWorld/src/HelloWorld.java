import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	
	static Scanner sc;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		HelloUser user = new HelloUser(name);
		
		System.out.println(user.greetUser());
	}

}
