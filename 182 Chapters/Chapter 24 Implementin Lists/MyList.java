public interface MyList<E> extends java.lang.Iterable<E>
{
//adds a new element at the end of the list
public void add(E e);

// add a new element at the specified index in this list
public void add(int index, E e);

// clear the list
public void clear();

// return true if this list contains the element
public boolean contains(E e); 

//return the element from this list at the specified index 
public E get(int index);

}