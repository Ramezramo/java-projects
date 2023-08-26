package from_python_to_java;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


public class test_chat_gpt {


	public class FileSearcher {

	    public static void main(String[] args) throws IOException {

	        String searchTerm = "example"; // search term
	        Path startPath = Paths.get("C:\\Users\\User\\Documents\\"); // start directory

	        Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {

	            @Override
	            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
	                if (file.toString().contains(searchTerm)) { // check if file name contains search term
	                    System.out.println(file);
	                }
	                return FileVisitResult.CONTINUE;
	            }

	            @Override
	            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
	                return FileVisitResult.CONTINUE;
	            }
	        });
	    }
	}

}
