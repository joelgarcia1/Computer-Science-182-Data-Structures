public class MyArrayList<E> extends MyAbstractList<E>
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
checkIndex(index);
return data[index];
   }
   
}