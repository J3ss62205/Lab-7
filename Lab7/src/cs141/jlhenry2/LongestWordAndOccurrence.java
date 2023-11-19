package cs141.jlhenry2;

public class LongestWordAndOccurrence {
	
	private String LW = "";
	private int occ = 0;
	private int length = 0;
	//Variables yayyyyyyyyyyyyyyyy
	
	private  String[][] dictionary = {
			{"adaptable","adventurous", "affectionate", "amiable", "compassionate", "easygoing", "emotional", "adventurous", "generous"},
			{"ambitious", "brave", "calm", "decisive", "compassionate", "charming"},
			{"hard-working", "helpful", "honest", "compassionate", "energetic"}};
	//This is my dictionary 
	
	public LongestWordAndOccurrence() {
		findLongestWordAndOccurrences(dictionary);
		printArray(dictionary);
	}//This is the constructor that gets called by the main class
	
	public void findLongestWordAndOccurrences(String[][] dictionary) {
		LW = dictionary[0][0];
		//LW is short for longest word and we set it to the first word in the first array 
		for (int i = 0; i < dictionary.length; i++) {
			for (int j = 0; j < dictionary[i].length; j++) {
				if (length < dictionary[i][j].length()) {
					LW = dictionary[i][j];
					length = dictionary[i][j].length();
				}//This will check the arrays and see if a different word is longer or not
			}
		}
		
		for (int i = 0; i < dictionary.length; i++) {
			for (int j = 0; j < dictionary[i].length; j++) {
				if(dictionary[i][j].equals(LW)) {
					occ++;
				}//This will go though everything and count the amount of occurrences the LW has
			}
		}
	}
	
	public void printArray(String[][] dictionary) {
		System.out.println("The contents of the dictionary:");
		System.out.println("********************");
		//Prints that 
	
		for (int j = 0; j < dictionary.length; j++) {
			for (int i = 0; i < dictionary[j].length; i++) {
				if (i < 8) {
					System.out.printf("%-20s", dictionary[j][i]);			
				}//This prints the dictionary 
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("********************");
		System.out.println("The longest word is: " + LW);
		System.out.println("The # of occurrences of " + LW + " is: " + occ);
		//This will print the LW and OCC
	}
	
	

}
