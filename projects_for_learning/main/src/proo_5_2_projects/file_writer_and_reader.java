package proo_5_2_projects;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer_and_reader {





		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("writing");
			try {
				String file_path = "D:\\programming\\java files\\learning\\j6\\proo\\src\\working_with_files\\poem.txt";
				FileWriter file = new FileWriter(file_path);

				file.write("\nhi ramez this is me your bot \nhi hello ");
				
				file.append("hi world");
				

				
				
				file.close();
				FileReader reader = new FileReader(file_path);
				int data = reader.read();
				
				while(data != -1) {
					System.out.print((char)data);
					data = reader.read();
					
				}
				reader.close();
			} catch (FileNotFoundException s) {
				// TODO: handle exception
				s.printStackTrace();
			}

			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
