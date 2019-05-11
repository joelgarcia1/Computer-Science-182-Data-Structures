public class MyAbstractClass<E> implements MyList<E>
{
protected int size = 0;

//Create a default list
protected MyAbstractList(){
}

// create a list from an array of objects
protected MyAbstractList(E[] objects)     //contructor
{
for(int i = 0; i < objects.length; i++)
add(size, e);
}

@Override   // add a new element at the end of the list
public void add(E e)    implement add(E e)
{
add(size e);
}

@Override
public boolean isEmpty()
{
return size == 0;
}

@Override
public int size()
{
return size;
}

@Override
public boolean remove(E e)
{
if(indexOf(e) > = 0)
{
remove(indexOf(e));
return true;
}
else 
   return false;
}

}