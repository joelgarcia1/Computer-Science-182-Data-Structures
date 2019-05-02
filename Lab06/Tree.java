import java.util.Collection;

public interface Tree<E> extends Collection<E> {
  /** Return true if the element is in the tree */
  public boolean search(E e);

  /** Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e);

  /** Delete the specified element from the tree
   * Return true if the element is deleted successfully */
  public boolean delete(E e);
  
  /** Get the number of elements in the tree */
  public int getSize();
  
  
  
  /** Inorder traversal from the root*/
  public default void inorder() {
  }

  /** Postorder traversal from the root */
  public default void postorder() {
  }

  /** Preorder traversal from the root */
  public default void preorder() {
  }
  
  /** Return the height of this binary tree */
   public  int height(); // Left as exercise: implement in BST
  
  /** BreadthFirst traversal from the root */
  public default void breadthFirstTreversal() {
	  // Left as an exercise: implement in BST
  }
  
  
  
  @Override /** Return true if the tree is empty */
  public default boolean isEmpty() {
    return this.size() == 0;
  }

  @Override
  public default boolean contains(Object e) {
    return search((E)e);
  }
  
  @Override
  public default boolean add(E e) {
    return insert(e);
  }
  
  @Override
  public default boolean remove(Object e) {
    return delete((E)e);
  }
  
  @Override
  public default int size() {
    return getSize();
  }
  
@SuppressWarnings("unchecked")
@Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise
	 	 for (Object e: c)
       {
       if(!contains(e))
         {
         return false;
         //break
         }
       }
    return true;
  }

 @SuppressWarnings("unchecked")
@Override
  public default boolean addAll(Collection<? extends E> c) {
    // Left as an exercise
	  			  for(E e : c)
              {
              if(add(e))
              {
              return false; //? put false
              }
             }
    return true;
  }

@SuppressWarnings("unchecked")
@Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise
	 for(Object e : c)
    {
      if(remove(e))
      return true; //suppose to be true?
    }
    return false;
  }

@SuppressWarnings("unchecked")
@Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise
	 
    return true;
   
  }

  @Override
  public default Object[] toArray() {
   int s = size();
   Object[] temp = new Object[s];
   for(int i = 0; i<s;i++)
   {
   temp[i] = i;
   }
    return temp;
  }

@SuppressWarnings("unchecked")
@Override
  public default <T> T[] toArray(T[] array) {
    // Left as an exercise
	// int s = size();
   //for(int i = 0; i < s; i++)
    //array[i] = T[] getSize();
   return array;
  
  }
  
 

}