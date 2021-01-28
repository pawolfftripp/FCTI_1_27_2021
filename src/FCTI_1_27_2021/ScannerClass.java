package FCTI_1_27_2021;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerClass {
	
	public static String[] answerArray = {};
	
	public static void nameGreeting() {
	Scanner userInput = new Scanner(System.in);	
	System.out.println("Please Enter your name: ");
	String nameOne = userInput.nextLine();
	System.out.printf("Hello, %s - ", nameOne);
	System.out.println("Would you like to continue? Y or N");
	String userContinue = userInput.nextLine();
    if (userContinue.equals("Y")) {
    	System.out.println(">>>>>>>>>>>>>>>>>Continue<<<<<<<<<<<<<<<<<");
    	String userEnter = userInput.nextLine();
    }
    else {
    	System.out.println("Maybe next time.");
    	System.exit(0);
    }
	}
	
	public static String[] questionLooper() {
		Scanner userInput = new Scanner(System.in);
		int reset_flag = 0;
		
		
		while (reset_flag == 0) { 
		System.out.println("Do you have a red car? (Y or N) ");
		String redCar = userInput.nextLine(); 
		System.out.println("What is the name of your favorite pet? ");
		String favoritePet = userInput.nextLine();
		System.out.println("What is the first name of your favorite actress or actor? ");
		String favAct = userInput.nextLine();
		System.out.println("What is the age of your favorite pet?");
		String petAge = userInput.nextLine();
		System.out.println("What is your favorite quarterbacks jersey number? ");
		String jerseyNum = userInput.nextLine();
		System.out.println("What is the two-digit model year of your car? ");
		String carModel = userInput.nextLine();
		System.out.println("Enter a random number between 1 and 50");
		String ranNum = userInput.nextLine();
		System.out.println("Would you like to change your answers? (Y or N) ");
		String tryAgain = userInput.nextLine();
		if (tryAgain.equals("Y")) {
			System.out.println("Try again.");
			reset_flag = 0;
		} else {
			reset_flag = 1;
		}
		String[] answerArray = {redCar,favoritePet,favAct,petAge,jerseyNum,carModel,ranNum};
		System.out.println(Arrays.toString(answerArray));
		}
		userInput.close();
		return answerArray;
	}
	
	public static void magicBall() {
		System.out.println(Arrays.toString(answerArray));
		int ranNum = (int)(Math.random() * 100);
		System.out.println(ranNum);
	}

}


