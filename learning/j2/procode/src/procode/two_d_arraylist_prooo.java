package procode;
import java.util.*;
//25/3/2023
public class two_d_arraylist_prooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> greoceryList = new ArrayList();
		ArrayList<String> bakerylist = new ArrayList();
		bakerylist.add("cheese");
		bakerylist.add("humpurger");
		bakerylist.add("melokhia");
		
		ArrayList<String> drinklist = new ArrayList();
		drinklist.add("cheese2");
		drinklist.add("humpurger2");
		drinklist.add("melokhia2");
		
		ArrayList<String> productlist = new ArrayList();
		productlist.add("cheese3");
		productlist.add("humpurger3");
		productlist.add("melokhia3");
		
		greoceryList.add(bakerylist);
		greoceryList.add(drinklist);
		greoceryList.add(productlist);
		
		System.out.println(greoceryList.get(1).get(0));
	}

}
