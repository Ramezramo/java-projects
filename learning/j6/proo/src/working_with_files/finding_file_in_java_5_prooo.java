package working_with_files;

import java.io.File;

public class finding_file_in_java_5_prooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("C:\\Users\\VEGA Laptop\\Desktop\\secret_message - Copy.txt");
		
		if (file.exists()) {
			System.out.println("the file exists:o!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			System.out.println(file.getPath());
//			file.delete();
		}
		else {
			System.out.println("no file in this directory");
		}
		

	}

}
