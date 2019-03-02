package CS3310.efadanelli.HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		long timer = System.currentTimeMillis();
				
		File file = new File("url.txt");
		Scanner fileScanner = new Scanner(file);
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		int count = 0;
		String dataLine = "";										//initializes dataLine, where the line of data is initially stored
		while(fileScanner.hasNextLine()) {
			count++;
			if(count == 1) {
				dataLine = dataLine + fileScanner.nextLine() + " ";	//updates dataLine
			}
			if(count == 2){
				dataLine = dataLine + fileScanner.nextLine();		//splits dataLine and adds it to arrayList
				String[] dataLineSplit = dataLine.split(" ");
				data.add(dataLineSplit);
				dataLine = "";
				count = 0;
			}
			
		}
		
		
		/****************************************************************/
		/***********************test Code********************************/
		for(int i = 0 ; i < data.size() ; i++) {
			for(int j = 0 ; j < data.get(i).length ; j++) {
				if(j == 0) {
					System.out.println();
				}
				System.out.print(data.get(i)[j] + " ");
				if(j == 0) {
					System.out.println();
				}
			}
		}
		/****************************************************************/
		/****************************************************************/
		
		fileScanner.close();
		boolean end = false;
		String answer = "";
		
		Scanner kbd = null;
		while(end != true) {
			System.out.println("\nPlease enter a query");
			kbd = new Scanner(System.in);
			String query = kbd.nextLine();
			/************************************************************************/
			
			//TODO place hashmap queries here
			
			/************************************************************************/
			
			System.out.println("Would you like to continue? Please enter \'N\' \'n\' \'No\'  or \'no\' to stop.");
			answer = kbd.nextLine();
			if(answer.equals("N") || answer.equals("n") || answer.equals("No") || answer.equals("no")) {
				end = true;
			}
			
			
		}
		kbd.close();
		
	}
}
