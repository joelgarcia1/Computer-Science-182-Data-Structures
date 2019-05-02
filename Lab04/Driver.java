import java.io.*;
//Joel Garcia Valencia
//Lab04
//2pm


public class Driver {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		SpellCheckInterface check = new SpellChecker();
		check.loadDictionary("dictionary.txt");
		if(check.checkDocument("test.txt"))
			System.out.println("No misspelled words found");
		
		if(check.checkDocument("short.txt"))
			System.out.println("No misspelled words found");
			
		}

	}


