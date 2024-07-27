package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * File file = new File(
		 * "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt"
		 * ); Scanner sc = null; try { sc = new Scanner(file); while (sc.hasNextLine())
		 * { System.out.println(sc.nextLine()); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { if (sc != null) {
		 * sc.close(); } } }
		 */

		//Second example code
		
		/*
		String path = "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		finally {
			try {

				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
		
	// Block try-with-resources
	
		
		String path = "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt";

		try(BufferedReader br=new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}	
		
}
