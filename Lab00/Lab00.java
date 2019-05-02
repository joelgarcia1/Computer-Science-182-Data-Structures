//Joel Garcia Valencia
//Lab00
//2pm
import java.util.*;

public class Lab00
{
   public static void main(String[]args)
   {
   int num, denom;
   ArrayList <Rational> list = new ArrayList<Rational>();
   for(int i = 0; i < 10; ++i)
   {
   num = (int)(Math.random()*51+1);
   denom = (int)(Math.random()*51+1);
   list.add(new Rational(num, denom));
   }
   System.out.println(list);
   System.out.println();
   System.out.println(Collections.max(list));
   Collections.sort(list);
   System.out.println();
   System.out.println(list);
   }
}