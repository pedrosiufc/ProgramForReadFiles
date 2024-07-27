package application;

import java.io.File;
import java.util.Scanner;

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

		// Second example code

		/*
		 * String path =
		 * "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt";
		 * FileReader fr = null; BufferedReader br = null;
		 * 
		 * try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); } }
		 * catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 * 
		 * finally { try {
		 * 
		 * if (br != null) { br.close(); } if (fr != null) { fr.close(); }
		 * 
		 * } catch (IOException e) { e.printStackTrace(); } } }
		 */

		// Block try-with-resources

		/*
		 * String path =
		 * "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt";
		 * 
		 * try(BufferedReader br=new BufferedReader(new FileReader(path))){
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); } }
		 * catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
		 */

		/*
		 * String[] lines= new String[] {"Good mornig", "Good Afternoon", "Good night"};
		 * 
		 * String path =
		 * "C:\\Users\\Pedro\\Git\\Eclipse_Workspace\\ProgramForReadFiles\\temp\\in.txt";
		 * 
		 * try (BufferedWriter bw=new BufferedWriter(new FileWriter(path, true))){
		 * for(String line: lines) { bw.write(line); bw.newLine(); } } catch
		 * (IOException e) { e.printStackTrace(); }
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		/*
		 * //listing folders
		 * 
		 * File[] folders = path.listFiles(File::isDirectory);
		 * System.out.println("FOLDERS:"); for (File folder : folders) {
		 * System.out.println(folder);
		 * 
		 * }
		 */

		//listing files
		
		/*
		 * File[] files = path.listFiles(File::isFile); System.out.println("FILES:");
		 * for (File file : files) { System.out.println(file); }
		 * 
		 * //create subfolder
		 * 
		 * boolean success =new File(strPath + "\\SubFolder").mkdir();
		 * System.out.println("Directory created successfully: " + success);
		 */
		
		//capturing the file name or path
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		
		sc.close();
	}

}