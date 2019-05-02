// Joel Garcia Valencia 
// 2pm
//Lab08
import java.io.*;
import java.util.*;

public class Lab08{
      @SuppressWarnings("unchecked")
	private static Map<String, Integer>[] boys = new HashMap[10];
	@SuppressWarnings("unchecked")
	private static Map<String, Integer>[] girls = new HashMap[10];
		
	   public  static void main(String[] args) throws IOException {
	  Scanner input = new Scanner(System.in);
	  String answer;
	  readNames();    // method to read the info from the files and add to our Map array
                       // Get user input and continue until done
		do {
			System.out.print("ENter a year (2008-2017): ");
			int year = input.nextInt();input.nextLine();
			System.out.print("Boy or girl? ");
			String sex = input.nextLine().toLowerCase();
			System.out.print("ENter a name: ");
			String name = input.nextLine();
         sex=sex.toLowerCase();
         int index=0;
         int ranking=0;
			switch (sex) {
			 // display the output based on the sex (boy or girl)
          
          //Boy
          case "boy":
  
         index=year-2008;

   ranking=boys[index].get(name);
   System.out.printf("The Boy named %s is ranked %d in %d \n",name,ranking,year);
  
   break;
  
  //Girld
   case "girl":

   index=year-2008;
   ranking=girls[index].get(name);
   System.out.printf("The Girl named %s is ranked %d in %d \n",name,ranking,year);
   break;
   
   default:
   
   System.out.println("sex should be boy or girl");
   break;
			            }
			
			System.out.print("Do you want check another name (yes or no)?");
			answer = input.nextLine().toLowerCase();
		  } while (answer.equals("yes"));
						
} // end main

		
		//read information from each file and add to appropriate Map array
		public static void readNames() throws IOException {
      String fixedName="babynameranking";
      int year=2008;
      String type=".txt";		
      File infile;
			for(int i=0;i<10;++i)
         {
				boys[i] = new HashMap<>();
				girls[i] = new HashMap<>();	
			}		
      for(int i=0;i<=9;++i)
       {
				  // construct the file name
				String filename = fixedName+Integer.toString(year)+type;// construct the file name ;
				infile = new File(filename);		
				Scanner in = new Scanner(infile);
				while(in.hasNext()) 
            {
            // read info from the file and add to Map arrays
			    int ranking=in.nextInt();
             String boyName=in.next();
             in.next();
             String girlName=in.next();
             in.next();
             boys[i].put(boyName, ranking);
             girls[i].put(girlName, ranking);
               					
				} // end while 
				in.close();
				year=year+1; 
			} // end for loop
		} // end readNames()

} // end Lab08
