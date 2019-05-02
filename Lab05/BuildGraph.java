//Joel Garcia Valencia
//Lab05
//2pm

import java.io.*;
import java.util.*;

public class BuildGraph 
   {
    static ArrayList<String> words = new ArrayList<>();
    static String end;
    
    /**
     *
     * @throws IOException
     */
    public static void main(String[] args) throws Exception
    {
      loadDictionary();
      Make();
    }
   
   public static void loadDictionary() throws IOException 
  {
	File infile = new File("dictionary.txt");
	try(Scanner in = new Scanner(infile);)
   {
       while(in.hasNextLine()) 
       {
         String word = in.nextLine();
         if(word.length()==4)
         {
         words.add(word);
         }
        }
    } catch (IOException ex)
      {
      System.out.println(ex);
      }
  }
    
         //W1 == first word  
         //W2 == second word 
    private static boolean ChangedLetters(String w1, String w2)
    {
        int count=0;
        for(int i=0; i<w1.length(); i++)
        {
            if(w1.charAt(i)!=w2.charAt(i))
            {
               count++;
            }
        }
        return count == 1;
    }
    

    public static void Make() throws IOException
    {
        File out = new File("graph.txt");
        PrintWriter writer = null;
        try{
            if(!out.exists())
            {
                out.createNewFile();
            }
            writer = new PrintWriter(out);
            for(int i=0; i<words.size(); i++)
             {
              writer.print(words.get(i) + " ");
              for(int j=0; j<words.size(); j++)
              {
                if(!words.get(i).equals(words.get(j)))
                {
                  if(ChangedLetters(words.get(i), words.get(j)))
                  {
                    writer.print(words.get(j) + " ");
                  }
                 }
              }
                writer.println();
             }
            writer.close();
           } catch(IOException e)
        {
        
        }
    }
}