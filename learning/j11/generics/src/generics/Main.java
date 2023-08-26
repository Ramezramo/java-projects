package generics;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intarray = {1,2,3,4,5};

		Double[] doublearray = {3.3,4.5,6.5,4.7};
		
		Character[] cararray = {'H','E','L','L','O'};
		String[] stringarray = {"B","Y","E"};
		displayarray(doublearray);
		displayarray(intarray);
		
		double array= getfirst(doublearray);
		System.out.println("\nthis is the first of all "+array);
	}
	public static <Thing> void displayarray(Thing[] array) {
		System.out.println("\n");
		for (Thing x : array) {
			System.out.print(x+" ");
		}
	
	}
	
	public static <Thing> Thing  getfirst(Thing[] array){
		
		return array[0];
		
	}
		 
//	public static void displayarray(Double[] array) {
//		
//		for (Double x : array) {
//			System.out.print(x+" ");
//		}
//	
//	}	
	

}
