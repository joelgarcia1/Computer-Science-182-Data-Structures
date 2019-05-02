import java.io.*;
public interface SpellCheckInterface {
	   /**
	     * Loads the dictionary contained in the specified file
	     * 
	     * @param filename The name of the dictionary file to be loaded
	     * @return true If the file was successfully loaded, false
	     *          if the file could not be loaded or was invalid
	     * @throws IOException if filename does not exist
	     */
	    public boolean loadDictionary(String fileName) throws IOException;
	    
	    /**
	     * Check the document for misspelled words
	     *
	     * @return true if the file was successfully spell checked, false
	     *         if the file had misspelled words 
	     * @throws IllegalArgumentException if filename is null
	     */
	    public boolean checkDocument(String fileName) throws IOException;

	}
