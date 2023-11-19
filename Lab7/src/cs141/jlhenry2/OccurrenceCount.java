package cs141.jlhenry2;
import java.util.*;


public class OccurrenceCount {
	
	Scanner scnr = new Scanner(System.in);
	private String sent = "";
	private String[]array3;
	private String[]array4;
	private int numWord = 0;
	private int numUniWord = 0;
	//Variables yayyyyyyyyyyyyyyyy
	

	
	public OccurrenceCount() {
		System.out.println();
		System.out.println("********************");
		System.out.println("Please enter a sentence");
		sent = scnr.nextLine(); //gets user input
		array3 = sent.split(" "); // makes that an array
		array4 = new String [array3.length]; // I now make a second array 
		for (int i = 0; i < array3.length; i++) { //This will go though all of the words in the array
			boolean found = false;
			for (int j = 0; j < numUniWord; j++) { 
				if(array4[j].equals(array3[i])) {	// This gets the unique words 
					found = true;
				}
			}
			if (found == false) { //when it is false then this will add the word to the array4 
				array4[numUniWord] = array3[i];
				numUniWord++;
			}
			
		}
		Words();
		printArray2(); //Finally prints :)
		
		
	}
	
	public void Words() {
		numWord = array3.length; //gets the total words
	}
	
	public int getWords() {
		return numWord;
	}
	
	public int OccCount(String word) { //word is our input
		int occ = 0;
		for (int i = 0; i < array3.length; i++) {
			if(array3[i].equals(word)) {
				occ++;	//This adds 1 to our current occurrence value
			}
		}
		return occ;
		//this returns that!
	}
	
	public void printArray2() {
		
		System.out.println("********************");
		System.out.println("The number of words in your statement is: " + numWord); //prints the total amount of words
		System.out.println("The number of unique words in your statement is: " + numUniWord ); //prints the total amount of unique words
		System.out.println("************************************************************************");
		System.out.printf("Word %20s \n",  "Occurrences");
		System.out.printf("---- %20s \n", "-----------");
		for (int i = 0; i < numUniWord; i++) { //This will print out the word and the amount of occurrences it does!
			System.out.printf("%-20s", array4[i]);
			System.out.printf("%-30s \n", OccCount(array4[i]));
		}	

		// - JH (I hope you like these comments, I'll start to do it more often ;) also thanks so much for all of your help on this!!!)

		
	}

}
