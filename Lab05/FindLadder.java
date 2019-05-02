import java.io.*;
import java.util.*;
public class FindLadder {

	public static void main(String[] args) throws IOException{
	    try(Scanner in = new Scanner(System.in);)
	    {		
	    WordLadder ladder = new WordLadder();
		ladder.loadWordtMap("graph.txt");
		System.out.print("Enter start word:");
		String start = in.nextLine();
		System.out.print("Enter end word:");
		String end = in.nextLine();
		if(!ladder.findLadder(start,end)) 
			System.out.println("No Path was found between \""+start+ "\" and \"" + end+"\"");
		
	    }
				
		
	}
	
	

}
