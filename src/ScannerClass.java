import java.util.Scanner;

public class ScannerClass {
		
	public static void nameGreeting() {
	Scanner userInput = new Scanner(System.in);	
	System.out.println("Please Enter your name: ");
	String nameOne = userInput.nextLine();
	System.out.printf("Hello, %s - ", nameOne);
	System.out.println("Would you like to continue? Y or N");
	String userContinue = userInput.nextLine();
    if (userContinue.equals("Y")) {
    	System.out.println(">>>>>>>>>>>>>>>>>Continue<<<<<<<<<<<<<<<<<");
    }
    else {
    	System.out.println("Maybe next time.");
    	System.exit(0);
    }
 //   userInput.close();
	}
	
	public static void questionLooper() {
		Scanner userInput = new Scanner(System.in);
		int reset_flag = 0;
		while (reset_flag == 0) {
		System.out.println("Do you have a red car? (Y or N) ");
		String redCar = userInput.nextLine(); 
		System.out.println("What is the name of your favorite pet? ");
		String favoritePet = userInput.nextLine();
		System.out.println("What is the age of your favorite pet?");
		int petAge = userInput.nextInt();
		System.out.println("What is your favorite quarterbacks jersey number? ");
		int jerseyNum = userInput.nextInt();
		System.out.println("What is the two-digit model year of your car? ");
		int carModel = userInput.nextInt();
		System.out.println("What is the first name of your favorite actress or actor? ");
		String favAct = userInput.nextLine();
		System.out.println("Enter a random number between 1 and 50");
		int ranNum = userInput.nextInt();
		System.out.println("Would you like to change your answers? (Y or N) ");
		String tryAgain = userInput.nextLine();
		if (tryAgain.equals("Y")) {
		reset_flag = 1;
		}
		
		//if (tryAgain.equals("Y")) {

			
		//}
		//else {
		//	System.out.println("this is a test");
		}
		System.out.println("TEST TEST TEST");
	//userInput.close();
	}
}
//}
