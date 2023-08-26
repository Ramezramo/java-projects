package procode;

public class array_1_38_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] cars = {"tesla","BMW","corvette"};
//		if the beginning is a string you only can put strings if you wnt int begin a new array with int and put on it the ints elements
		
		
		cars[0] = "ramez";
//		System.out.println(cars[0]);
//		////////////////////////////////////
//		another example
		String[] cars2 = new String[3];
		cars2[0] = "rommana";
		cars2[1] = "Camaro";
		cars2[2] = "tesla";
		
		for (int i = 0 ;i<cars2.length;i++) {
			System.out.println(cars2[i]);
		}
		
		
		

	}

}
