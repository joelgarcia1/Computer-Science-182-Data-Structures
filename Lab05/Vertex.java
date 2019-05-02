 
public class Vertex {
	private String word;
	
	
	public Vertex() {
		
	}
	
	public Vertex(String word) {
		this.word=word;
		
	}
	
	public Vertex(String word, boolean v) {
		this.word=word;
		
	}
	
	public void setCity(String word) {
		this.word=word;
	}
	
	public String getCity() {
		return word;
	}
	
	
	
	
	public String toString() {
		return word;
	}
	
	public boolean equals(Object v) {
		return this.word.equals(((Vertex)v).word);
	}
	

}
