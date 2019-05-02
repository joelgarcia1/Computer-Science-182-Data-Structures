import java.util.*;
public class Word implements Comparable<Word> {
   private String word;
   private ArrayList<Integer> lines;
	
   public Word() {
      lines = new ArrayList<>();
   }
	
   public Word(String w, int lineNumber) {
      word = w;
      lines = new ArrayList<>();
      lines.add(lineNumber);
   }
	
   public String getWord() {
      return word;
   }
	
   public ArrayList<Integer> getLines() {
      return lines;
   }
	
   public void addLine(int lineNumber) {
      lines.add(lineNumber);
   }
	
   public String toString() {
      return word + " : "+lines.toString();
   }
	
   /**
   *@return true if two words are equal, false otherwise
   */
   @Override
   public boolean equals(Object w) {
   //exercise
   	if(word == w)
      return true;
      else
      return false;
   }
	
   /**
   *@ compare two words and retun the corresponding integer value (<0, 0, >0)
   */
   @Override
   public int compareTo(Word w) {
      return this.word.compareTo(w.word);
   }

}