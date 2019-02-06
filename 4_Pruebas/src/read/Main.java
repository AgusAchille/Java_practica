package read;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String string;

		try {
			FileReader reader = new FileReader("C:/Users/Agustin/Desktop/10.txt");
		    BufferedReader buffer = new BufferedReader(reader);
		    FileWriter writer = new FileWriter("C:/Users/Agustin/Desktop/11.txt");
		    
		    string = buffer.readLine();
		    while(string != null) {
		    	buffer.readLine();
		    	
		    	string = buffer.readLine();
		    	string = string.trim();
		    	writer.write(string+" ");
		    	System.out.println(string);
		    	
		    	buffer.readLine();
		    	string = buffer.readLine();
		    }
			
			writer.close();
			reader.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
		}
	}
}
