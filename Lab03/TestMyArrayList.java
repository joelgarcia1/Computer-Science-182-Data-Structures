//Joel Garcia Valencia
//Lab03
//2pm
import java.util.*;

public class TestMyArrayList 
{
	
		  public static void main(String[] args) 
        {
		    new TestMyArrayList();
		  }

		  public TestMyArrayList() 
        {
		    String[] name1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		    String[] name2 = {"George", "Michael", "Michelle", "Daniel"};
		    String[] name3 = {"Tom", "Peter"};
		    
		    MyList<String> list1 = new MyArrayList<String>(name1);   
		    MyList<String> list2 = new MyArrayList<String>(name2);  
		    MyList<String> list3 = new MyArrayList<String>(name3); 
		    System.out.println("list1:" + list1);
		    System.out.println("list2:" + list2);
		    System.out.println("list3:" + list3);
		    System.out.println("\n\nlist1 contains all of list3? "+ list1.containsAll(list3));
		    System.out.println("\n\nlist2 contains all of list3? "+ list2.containsAll(list3));
		    System.out.println("\n\nlist1 removed all of list3? "+ list1.removeAll(list3));
		    System.out.println("list1:" + list1);
		    System.out.println("\n\nlist2 removed all of list3? "+ list2.removeAll(list3));
		    System.out.println("list2:" + list2);
		    list1 = new MyArrayList<String>(name1);   
		    list2 = new MyArrayList<String>(name2);  
		    list3 = new MyArrayList<String>(name3); 
		    System.out.println("\n\nlist1 retains all of list3? "+ list1.retainAll(list3));
		    System.out.println("list1 After retainAll:" + list1 + "\n");
		    list1 = new MyArrayList<String>(name1);
		    list1.add("Bahram");
		    System.out.println("list1:" + list1);
		    System.out.println("list2:" + list2);
		    list1.addAll(list2);
		    System.out.println("After addAll:" + list1 + "\n");
		    Object[] nameArray1 = list1.toArray();
		 
		    System.out.println(new ArrayList(Arrays.asList(nameArray1)));
		    
		    String[] nameArray2 = new String[list1.size()];
		    nameArray2 = list1.toArray(nameArray2);
		   
		    System.out.println(new ArrayList<String>(Arrays.asList(nameArray2))+"\n");		  
		  }
}
