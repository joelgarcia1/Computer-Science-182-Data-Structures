import java.util.*;
public class HeapSort<T extends Comparable<T>> {

	protected Comparator<T> c;
	@SuppressWarnings("unchecked")
	public HeapSort() {
	    this.c = (e1, e2) -> ((Comparable<T>)e1).compareTo(e2);
	   
	  }

 private void Exchange(T[] A, int x, int y) //Does a Swap 
      {
         T temp = A[x]; //Place A[x-1] into temp
         A[x] = A[y]; // Place A[y-1] into A[x-1]
         A[y] = temp; // Place temp into A[y-1]
      } 
      
	  /** Create a BST with a specified comparator */
	  public HeapSort(Comparator<T> c) {
	    this.c = c;
	   
	  }
	  
	  public   void sort(T[] anArray) {
		  for(int index = anArray.length-1; index >=0; --index) {
			  heapRebuild(anArray,index,anArray.length);
			  
		  }
		  heapSort(anArray);
	  }
	  
      private void heapRebuild(T[] anArray, int root, int n) {
         // Left as an exercise
         int l = 2*root; 
         int r = (2*root)+1; 
           int max;
         if (l < n && anArray[l].compareTo(anArray[root]) > 0) { 
               max = l; 
         }
         else {
               max = root;
         }
         if( r < n && anArray[r].compareTo( anArray[max]) > 0 ){ 
               max = r; 
         }
         if(max != root)
         {
               Exchange(anArray, root, max); 
                 heapRebuild(anArray, max, n); 
         }
      }
	    
         
	  private void heapSort(T[] anArray) {
		// Left as an exercise    	
     int heapSize = anArray.length;
         for(int i = anArray.length-1; i >= 1; i--){ 
               Exchange(anArray,0,i); 
               heapSize--; 
               heapRebuild(anArray,0,heapSize); 
         }
      }
}

   
     
	  

