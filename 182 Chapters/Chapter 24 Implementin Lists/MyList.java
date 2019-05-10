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

//returns the index of the first matching element in this list
// returns -1 if no match
public int indexOf(E e);

//return true if this list doesn't contain any elements
public boolean isEmpty();

// return the index of the last matching element in this list
//return -1 if no match
public int lastIndexOf(E e);

/* Remove the first occurrence of the element e from this list
shift any subsequent elements to the left
returns true if the element is removed */

public boolean remove(E e);

/* Remove the element at the specified postition 
 and shifts any subsequent elements to the left
return the element that was removed from the list

*/
public E remove(int index);

/*replace the element at the specified position in this list
with the specified element and return the old element
*/

public Object set(int index, E e);

//returns the number of elements in this list
public int size();
}