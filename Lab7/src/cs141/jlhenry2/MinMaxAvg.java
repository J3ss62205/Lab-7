package cs141.jlhenry2;

public class MinMaxAvg {
	
	private int [] array1 = {1, 4, -7, 5, 15};
		
	private int length = array1.length; 
	
	private double sum;
	private double avg; 
	private int min;
	private int max;
	//Variables yayyyyyyyyyyyyyyyy
	
	
	public MinMaxAvg() {
		setAvg();
		setMin();
		setMax();
		print();
	}//This is the constructor, it calls all of the methods 
	
	public void setAvg(){
		for(int i =0; i < array1.length; ++i) {
			sum += array1[i];
		}//This will get the total sum of the array
		
		avg = sum / length;
		//This will get the average
	}
	
	public double getAvg(){
		return avg; //this returns the average
	}
	
	public void setMin() {
		min = array1[0];
		//I set the min as the first of the array
		for(int i =0; i < array1.length; i++) {
			if(array1[i] < min ) {
				min = array1[i]; 
			} //This will go though and see if any number is smaller
		}
	}
	
	public int getMin() {
		return min; //returns the min
	}
	
	public void setMax() {
		max = array1[0];
		//I set the max as the first of the array
		for(int i =0; i < array1.length; ++i) {
			if(array1[i] > max ) {
				max = array1[i];
			} //This will go though and see if any number is larger
		}
	}
	
	public int getMax() {
		return max; //returns the max
	}
	
	public void print() {
		System.out.println("The contents of the array:");
		System.out.print(array1[0]);
		for(int i =1; i < array1.length; ++i) {
			System.out.print( ", " + array1[i]);
		} //This will print out the array
		System.out.println();
		System.out.println("********************");
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
		System.out.println("******************** \n");
		//This will print out min max and avg
		
	}

}
