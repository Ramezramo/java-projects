package working_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class writing_on_files_5_9_prooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter file = new FileWriter("D:\\programming\\java files\\learning\\j6\\proo\\src\\working_with_files\\poem.txt");
			file.write("\nhi ramez this is me your bot \nhi hello ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
