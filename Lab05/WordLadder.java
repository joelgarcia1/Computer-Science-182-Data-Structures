import java.io.*;
import java.util.*;
public class WordLadder {
    private ArrayList<Node> list; // list representing the word graph
    private LinkedList<Vertex> route = new LinkedList<>(); // list representing the ladder
    public WordLadder() {
        list=new ArrayList<>();
    }
    
    public void loadWordtMap(String fileName) throws IOException 
  {
	 File infile = new File(fileName);
	 try(Scanner get = new Scanner(infile);)
      {
        while(get.hasNextLine()) 
            {
		// read a line
                String s = get.nextLine();
                String[] tokens = s.split(" ");// split into a String[] called tokens  based on “ “
                Node word = new Node(new Vertex(tokens[0]));  // create a new Node based on tokens[0]
                // add the rest of the tokens to word.addPath()
                for(int i = 1; i < tokens.length; ++i)
                {
                    word.addPath(new Vertex(tokens[i]));
                }  
                list.add(word); // add the word to “list”
            }
	   }
  }

    /**
     * Find the ladder between start and end city, if it exists. Otherwise return false
     * @param start
     * @param end
     * @return
     */
     
    public boolean findLadder(String start,String end) {
	Stack<Vertex> stack = new Stack<>();
	LinkedList<Vertex> visited = new LinkedList<>(); // visited list of vertices
	Vertex startWord = new Vertex(start);
	Vertex endWord = new  Vertex(end);
        Vertex v;
        //Check to see if startWord and endWord are part of the graph. Otherwise, print
        Boolean StartWords = false;
        Boolean EndWords = false;
        for(Node node : list){
            if(node.getword().equals(startWord)){
                StartWords = true;
            }
            if(node.getword().equals(endWord)){
                EndWords = true;
            }
        }
        //Error message and return false.
        if(!EndWords || !StartWords){
            System.out.println("Error!");
            return false;
        }
        //mark all cities as unvisited
        visited = new LinkedList<>();
        stack.push(startWord); //Add startWord to aStack
        visited.add(startWord); //Mark startWord as visited by adding it to visited
        
        
        while (!stack.isEmpty() && !stack.peek().equals(endWord)) {
            //Get the path of the vertex at top of aStack
            ArrayList<Vertex> path = list.get(list.indexOf(new Node(stack.peek()))).getPath();
            if(path.isEmpty())
             stack.pop();
            else
            {
                v = null;
                for(int i=0; i< path.size();++i)
                {
                if(visited.contains(path.get(i)))
                {
                    path.remove(i);
                }
                else
                {
                    v=path.remove(i);
                    break;
                }
                    
            }
            if(v==null)
            {
                stack.pop();
            }
            else
            { 
            stack.push(v); //Add v to aStack
            visited.add(v);//Add v to visited
            }
            
            }
            
            
        } // end while
		
        // Rebuild the ladder from startWord to endWord and print
        if(!stack.isEmpty())
         {
            while(!stack.isEmpty())
            {
                route.addFirst(stack.pop());
            }
            System.out.println("Found path of "+ route.size()+ " cities");
            System.out.println(route);
            return true;
        }
        return false;
    } // end findLadder
} // end WordLadder

/**
  * A node in the graph is represented by a Vertex and path to other words
  */
class Node{
    private Vertex word;  // Graph vertex
    private ArrayList<Vertex> path; // list of vertices in the path
    public Node() {
        path = new ArrayList<>();
    }

    public Node(Vertex word) 
    {
        this.word = word;
        path = new ArrayList<>();
    }

    public void setword(Vertex word) 
    {
        this.word = word;
    }

    public Vertex getword() 
    {
        return word;
    }

    public ArrayList<Vertex> getPath()
    {
        return path;
    }

    public void addPath(Vertex v) 
    {
        path.add(v);
    }

    public String toString() 
    {
        return word +"-->"+path;
    }

    public boolean equals(Object e) 
    {
        Vertex v = ((Node)e).getword();
        return this.word.equals(v);
    }
}
