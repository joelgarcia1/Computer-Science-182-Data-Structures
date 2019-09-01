public abstract class MyAbstractClass<E> implements MyList<E>
{
protected int size = 0;

//Create a default list
protected MyAbstractClass(){
}

// create a list from an array of objects
protected MyAbstractClass(E[] objects)     //contructor
{
for(int i = 0; i < objects.length; i++)
add(objects[i]);
}

@Override   // add a new element at the end of the list
public void add(E e)   
{
add(size, e);
}

@Override // This returns true if there is no element on the list
public boolean isEmpty()
{
return size == 0;
}

@Override  //returns the number of elements on the list
public int size()
{
return size;
}

@Override /* Removes the first occurence of the element e from the list
and shifts any subsequent to the left, returns true if the element is removed
*/
public boolean remove(E e)
{
if(indexOf(e) >= 0)
{
remove(indexOf(e));
return true;
}
else 
   return false;
}

}