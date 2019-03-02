package CS3310.efadanelli.HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("sample.txt");
		Scanner fileScanner = new Scanner(file);
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		int count = 0;
		String dataLine = ""; //initializes dataLine, where the line of data is initially stored
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
	}

}
