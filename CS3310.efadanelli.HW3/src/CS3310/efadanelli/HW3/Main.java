package CS3310.efadanelli.HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		long timer = System.currentTimeMillis();
				
		File file = new File("sample.txt");
		Scanner fileScanner = new Scanner(file);
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		int count = 0;
		String dataLine = "";	//initializes dataLine, where the line of data is initially stored
		
		int numData = 0;		//instantiates numData, the number of keys we need
		int counter = 0;
		while(fileScanner.hasNextLine()) {
			
			count++;
			if(count == 1) {
				dataLine = "";
				dataLine = dataLine + fileScanner.nextLine() + " ";	//updates dataLine
			}
			if(count == 2){
				
				dataLine = dataLine + fileScanner.nextLine();		//splits dataLine and adds it to arrayList
				String[] dataLineSplit = dataLine.split(" ");
				data.add(dataLineSplit);
				count = 0;
				numData = numData + data.get(counter).length - 1;		//updates the number of data entries
				counter++;
			
			}
			
			
		}
		
		
		/****************************************************************/
		/***********************test Code********************************/
		for(int i = 0 ; i < data.size() ; i++) {
			for(int j = 0 ; j < data.get(i).length ; j++) {
				
		
				
				System.out.print(data.get(i)[j] + " ");
				
			}
			System.out.println();
		}
		/****************************************************************/
		/****************************************************************/
		
		fileScanner.close();
		boolean end = false;
		String answer = "";
		
		Map_HashNode<String, String> map = new Map_HashNode<>();
//		map.add(data.get(0)[1], data.get(0)[0]);
//		map.add(data.get(0)[2], data.get(0)[0]);
//		map.add(data.get(0)[3], data.get(0)[0]);
//		map.add(data.get(0)[4], data.get(0)[0]);
		for(int i = 0 ; i < data.size(); i ++) {
			for(int j = 1 ; j < data.get(i).length ; j++) {
				map.add(data.get(i)[j], data.get(i)[0]);
			}
		}
		
		
		Scanner kbd = null;
		
		while(end != true) {
			ArrayList<String> results = new ArrayList<String>();
			System.out.println("\n\nthe number of data members is " + numData); //prints number of data entries
			
			System.out.println("\nPlease enter a query");
			kbd = new Scanner(System.in);
			String query = kbd.nextLine();
			/************************************************************************/
			
			//TODO queries go here, i moved the Node creation out of this loop so we dont 
			//have a time complexity of n^3 lol
			String ret = "";
			while(ret != null) {
				ret = map.remove(query);
				results.add(ret);
				
			}
			
			for(int i = 0 ; i < results.size(); i++) {
				
					System.out.println(results.get(i));
			
				
			}
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
