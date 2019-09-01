public class MyArrayList<E> extends MyAbstractClass<E>
{
public static final int Initial_capacity = 16; //initial capacity
private E[] data = (E[]) new Object[Initial_capacity]; //creates an array

//Creates a default list
public MyArrayList()        //no-args Constructor
{
}

// creates a list from an array of objects
public MyArrayList(E[] objects)          //Constructor
{
for(int i = 0; i < objects.length; i++)
add(objects[i]);
}

@Override //add a new element at the specified index
public void add(int index, E e)
{
ensureCapacity();
//this moves the elements to the right after the specified index 
for(int i = size - 1; i >= index; i--)
data[i + 1] = data[i];

//inserts new element to data[index]
data[index] = e;
//increase size by 1
size++;
}

//creates a new larger array, double the current size + 1
private void ensureCapacity() {  //ensureCapacity
if(size >= data.length) {
E[] newData = (E[]) (new Object[size * 2 + 1]);  // double capacity + 1
System.arraycopy(data, 0 , newData, 0, size);
data = newData;
   }
  }

@Override   //clear the list
public void clear()
{
data = (E[]) new Object[Initial_capacity];
size = 0;
} 

@Override // return true if this list contains the element
public boolean contains(E e)
{
for(int i = 0; i < size; i++)
   if(e.equals(data[i])) 
   return true;
   return false;
}

@Override // return the element at the specified index
public E get(int index) {
check_Index(index);
return data[index];
   }
   
   private void check_Index(int index)
   {
   if(index < 0 || index >= size) 
   throw new IndexOutOfBoundsException
   ("index " + index + " out of bounds");
   }
   
   /*Returns the index of the first element, if not 
   it returns -1 */
    @Override
   public int indexOf(E e)
   {
   for (int i = 0; i <size; i++)
      if(e.equals(data[i])) 
      return i;
      
      return -1;
   }
   
     /*Returns the index of the last element, if not, 
   it returns a -1*/
   @Override
   public int lastIndexOf(E e)
   {
   for(int i = size - 1; i >= 0; i--)
      if(e.equals(data[i])) 
      return i;
      
      return -1;
   }
   /* removes the elemen at the specifies postion, shifts to the left 
   and returns the element that was removed
   */
   @Override
   public E remove(int index)
   {
   check_Index(index);
   E e = data[index];
   
   //shifts to the left
   for(int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
      
      data[size - 1] = null; //now null
      
      size --;
      return e; 
   }
   
   /*Replace the element at the specified position with 
   a specified element */
   @Override
   public E set(int index, E e)
   {
   check_Index(index);
   E Old_element = data[index];
   data[index] = e;
   return Old_element;
   }
    
    @Override
    public String toString()
    {
    StringBuilder result = new StringBuilder("[");
     for(int i =0; i < size; i++)
     {
      result.append(data[i]);
      if(i < size - 1)result.append(", ");
     }
     return result.toString() + "]";
    }
    
    //Trims the capacity to the current size
    public void trimeToSize()
    {
    if (size != data.length)
    {
    E[] newData = (E[])(new Object[size]);
    System.arraycopy(data, 0, newData, 0, size);
    data = newData;     
     } //if size == capacity, no need to trim
    }
    
    @Override //Override interator() defined in  Interable
    public java.util.Iterator<E> iterator()
    {
    return new ArrayListIterator();
    }
    
    private class ArrayListIterator 
      implements java.util.Iterator<E> {
    private int current = 0; //current index
    
    @Override
    public boolean hasNext()
    {
    return (current < size);
    }
    
    @Override 
    public E next()
    {
    return data[current++]; 
    }
    
    @Override
    public void remove()
    {
    MyArrayList.this.remove(current);
    }
   }
}