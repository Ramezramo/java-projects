// 25 \ 3 \ 2023
package procode;

import java.util.Scanner;

public class nested_loops_1_32_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows ;
		int columns;
		String sympol = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter raws ; ");
		rows = scan.nextInt();
		
		System.out.println("columns : ");
		columns = scan.nextInt();
		
		System.out.println("input the sympol : ");
		sympol = scan.next();
		
		for(int i = 1;i<=rows;i++) {
			System.out.println();
			for (int j = 1 ; j <= columns;j++) {
				System.out.print(sympol);
			}
		}
	}

}
