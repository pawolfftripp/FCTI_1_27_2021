
public class AsciiChars {
	public static void printNumbers() {
		System.out.println("Valid numbers: ");
		int[] asciiNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		for (int i : asciiNum) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	public static void printLowerCase() {
		System.out.println("Valid lowercase: ");
		String[] asciiLowerCase = {"a","b","c","d","e","f","h","i","k","l","m","n","o",
								   "p","q","r","s","t","u","v","w","x","y","z"};
		for (String i: asciiLowerCase) {
			System.out.print(i + " ");
		}
		System.out.println(); 
	}
	
	
	public static void printUpperCase() {
		System.out.println("Valid UpperCase: ");
		String[] asciiUpperCase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
		                           "P","Q","R","S","T","U","V","Q","R","S","T","U","V","W","X","Y","Z"};
		for (String i: asciiUpperCase) {
			System.out.print(i + " ");
		}
		System.out.println();
		                        
		                          
	}
}
