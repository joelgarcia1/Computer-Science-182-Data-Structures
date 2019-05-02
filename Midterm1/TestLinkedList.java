import java.util.*;
public class TestLinkedList
{
   public static void main(String[]args)
   {
   LinkedList<Integer>list= new LinkedList<>();
   ListIterator<Integer>iter;
   list.add(new Integer(5));
   list.add(new Integer(15));
   list.add(new Integer(25));
   list.add(new Integer(35));
   System.out.println(list);
   iter = list.listIterator();
   while(iter.hasNext())
    {
      Integer num = iter.next();
      System.out.print(list.indexOf(num + ")" + num));
    }
   }
}