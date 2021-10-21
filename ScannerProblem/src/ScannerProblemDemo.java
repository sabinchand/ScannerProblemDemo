	//Sometimes we face problems when we are trying to input "String" after inputting int/float/double/long/byte/short/char
	//It is because before coming to the String we've hit the enter button and the String takes that enter as "\n" String characters.
	//Hence by hitting enter, we have already given the input to the String.
	//And it goes to the next statement.
	//The problem and two solutions are shown below in separate methods below.
	
import java.util.Scanner;
public class ScannerProblemDemo{

	static Scanner s = new Scanner(System.in);
	
	public static void problem() {
		System.out.println("Your age:");
		int dateOfBirth = s.nextInt();
		
		System.out.println("Your first name:");
		String firstName = s.nextLine();	//this line consumes the enter "\n" we hit, after inputting dateOfBirth
		
		System.out.println("Your last name:");
		String lastName = s.nextLine(); 
	}
	
	//Easiest solution would be, add a line - "nextLine()" method- before String input, so that "\n" is taken or consumed by this line.
	public static void solutionforScanner1() {
		System.out.println("Your age:");
		int dateOfBirth = s.nextInt();
		
		s.nextLine();	//SOLUTION
		
		System.out.println("Your first name:");
		String firstName = s.nextLine();
		
		System.out.println("Your last name:");
		String lastName = s.nextLine();
	}
	
	// Another solution would be use input in the string form using - "nextLine()" method, which takes enter,i.e. "\n".
	// And then change it to int/double by the use of parseInt()/parseDouble() method.
	public static void solutionforScanner2() {
		System.out.println("Your age:");
		int dateOfBirth = Integer.parseInt(s.nextLine());	//SOLUTION
		
		System.out.println("Your first name:");
		String firstName = s.nextLine();
		
		System.out.println("Your last name:");
		String lastName = s.nextLine();
	}

}

