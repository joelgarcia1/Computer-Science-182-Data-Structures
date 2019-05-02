import java.util.*;
import java.io.*;
public class SpellChecker implements SpellCheckInterface {
 
   LinkedList<String> dict;
   LinkedList<Word> misspelled;
	
   public SpellChecker() {
      dict = new LinkedList<>();
      misspelled = new LinkedList<Word>();
   }
	
	 /**
     * Loads the dictionary contained in the specified file
     * 
     * @param filename The name of the dictionary file to be loaded
     * @return true If the file was successfully loaded, false
     *          if the file could not be loaded or was invalid
     * @throws IOException if filename does not exist
     */
   @Override
   public boolean loadDictionary(String fileName) throws  IOException 
   {
   	// Left as exercise
      File infile = new File("C:/Users/danie/Desktop/Lab 4/dictionary.txt"); //Change this for later
      if(!(infile.exists()))
      {
         return false;
      }
      Scanner get = new Scanner(infile);
      while(get.hasNextLine())
      {
         dict.add(get.next()); // adds all words into the dictionary
      }
      return true;
   }
	
	 /**
     * Check the document for misspelled words
     *
     * @return A list of misspelled words and
     *         the line numbers where they occur.
     * @throws @throws IOException if filename does not exist
     */
   @Override
    public boolean checkDocument(String fileName) throws IOException 
    {
            int listindex = 0;
      misspelled = new LinkedList<>();  // Initialize for each file
      int lineNumber = 0;
      try 
      {
         File infile = new File(fileName);
         System.out.println("\n\nFile Name: "+ fileName);
         try ( Scanner in = new Scanner(infile); )	
         {
          // Correct code to be added
          
        while (in.hasNextLine()){
            	
        String line = in.nextLine().toLowerCase(); // Converts all words to lowercase to be compared with dictionary
        lineNumber++; // Goes to next Line
        String[] tokens = line.split("[ \\P{Alpha}]+"); //Splits all words into array string tokens to be compared
        for(int i=0;i<tokens.length;++i) {
        if (tokens[i].length()==0) // ignore blank lines
         continue;
        if(!dict.contains(tokens[i])) {
        Word word = new Word(tokens[i],lineNumber); //This is checked if the word is not in the list
                     
        if(misspelled.size() == 0)
            {
              misspelled.add(word); //Add the misspelled word if nothing is in the list
            }
                     else
            {
          if(misspelled.contains(word)) //This is still debateable, but looks for the same type of word
             {
               System.out.println(misspelled.contains(word));
               LinkedList<Word> temp = new LinkedList<Word>();
              for(int j = 0; j < misspelled.size(); j++) //Looks for the matching string to add line numbers
             {
               Word transfer = misspelled.pop();
               if(transfer.equals(word) == true) //Adding line numbers
               {
                int[] linenumbers = new int[transfer.getLines().size()];
                ArrayList<Integer> lines = transfer.getLines();
                for(int k = 0; k < transfer.getLines().size(); k++)// Extracts number from arraylist<integer>
                {
                 linenumbers[k] = lines.get(k);
                }
                for(int x = 0; x < linenumbers.length; x++)
                 {
                transfer.addLine(linenumbers[x]);
                  }
                misspelled.push(transfer);
               }
                else
                {
                 misspelled.push(transfer);
                }
              }
                                               
             }
           }
                  
        misspelled.add(word);
        LinkedList<Word> temp = new LinkedList<Word>();
        
                  // Left as exercise
                  // if dictionary does not contain myWord:
                  // 'word' is misspelled
                  // if misspelled list contains 'word', update the lineNumber
                  // otherwise add a new Word to misspelled list                           
                  
                  } // end if	
               
               } // end for
            
            } // end while
         		
         } // end try
      } catch (IOException ex) {
         System.out.println(ex);
         return false;
      } // end catch
      // convert misspelled to array list aand then sort the list	
      
      Object[] list = misspelled.toArray();
      if(list.length == 0)
      return true;
      else 
      {
         System.out.println("Misspelled words are");
         for(Object w : list)
            System.out.println(w);
         return false;
      } //else
   } // checkDocument
} // class