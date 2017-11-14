package exceptions;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double z;
		int x = 9;
		int y = 0;
		
		/*try {
			z = x / y;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("divided by zero yaar");
			
		} finally {
			System.out.println("Final");
		}*/
		
		Path path = Paths.get("src","exceptions");
		
		//BufferedReader br  = Files.newBufferedReader(path.resolve("ExceptionExample.java"));
		
		try(BufferedReader br  = Files.newBufferedReader(path.resolve("ExceptionExample.java"))) {
			
		}
		
	}

}
