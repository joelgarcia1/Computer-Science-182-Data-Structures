import java.util.*;

public interface MyList<E> extends Collection<E> {
  /** Add a new element at the specified index in this list */
  public void add(int index, E e);

  /** Return the element from this list at the specified index */
  public E get(int index);

  /** Return the index of the first matching element in this list.
   *  Return -1 if no match. */
  public int indexOf(Object e);

  /** Return the index of the last matching element in this list
   *  Return -1 if no match. */
  public int lastIndexOf(E e);

  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);

  /** Replace the element at the specified position in this list
   *  with the specified element and returns the new set. */
  public E set(int index, E e);
  
  
  
  @Override 
  /** Add a new element at the end of this list */
  public default boolean add(E e) {
    add(size(), e);
    return true;
  }

  @Override 
  /** Return true if this list contains no elements */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override 
  /** Remove the first occurrence of the element e 
   *  from this list. Shift any subsequent elements to the left.
   *  Return true if the element is removed. */
  public default boolean remove(Object e) {
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }
  
  @Override
  /** Adds the elements in otherList to this list.
   * Returns true if this list changed as a result of the call */
  public default boolean addAll(Collection<? extends E> c) {
  
  //left as an exercise
	 boolean result = false;
        for(E o : c) {
            result = add(o) || result;
        }
        return result;
  }
  
  @Override /** Return true if this list contains the element */
  public default boolean contains(Object o) {
	  if(indexOf((E)o)==-1)
			  return false;
	  return true;
  }

  @Override
  /** Returns true if this collection contains all of the elements in the specified collection. */
  public default boolean containsAll(Collection<?> c) {
		  for(Object o : c) 
        {
            if(!contains(o)) 
            {
                return false;
            }
        }
        return true;
   }
  

  @Override
  /** Removes all the elements in otherList from this list 
   * Returns true if this list changed as a result of the call */
  public default boolean removeAll(Collection<?> c) {
    boolean result = false;
     for(Object o : c.toArray()) 
     {
            result = remove(o) || result;
     }
        return result;
  }

  @Override
  /** Retains the elements in this list that are also in otherList 
   * Returns true if this list changed as a result of the call */
  public default boolean retainAll(Collection<?> c) {
     // Left as an exercise
        boolean result = false;
        for(Object o: this.toArray()) {
            if(!c.contains(o)) {
                result = remove(o) || result;
            }
        }
        return result;
    }

  @Override
  /** Returns an array containing all of the elements in this collection. */
  public default Object[] toArray() {
	  Object[] temp = new Object[this.size()];
	  for (int i = 0; i < this.size(); i++)
	        temp[i]=(Object)(this.get(i));
	  if (size() > 0)
		  return (E[])temp;
	  else
		  return null;
	  
   
  }

  @Override
  /** Returns an array containing all of the elements in this collection; 
   * the runtime type of the returned array is that of the specified array.
   */
  public default <T> T[] toArray(T[] array) {
	 // Left as an exercise
        int i = 0;
        for(E x: this) 
        {
            array[i++] = (T) x;
        }
        return array;
  }
}
