package procode;

import java.util.ArrayList;

public class array_list_2_11_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "hi");
		food.remove(2);
//		food.clear();
		for(int s=0; s<food.size(); s++){
			System.out.println(food.get(s));
		}
		
	}

}
