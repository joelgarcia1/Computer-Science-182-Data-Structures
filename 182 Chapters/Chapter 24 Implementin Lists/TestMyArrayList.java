public class TestMyArrayList
{
   public static void main(String [] args)
   {
   MyList<String> list = new MyArrayList<String>(); //creates the list
   
   list.add("Svddendeath"); //adds to the list
   System.out.println("(1) " + list ); 
   
   list.add(0, "Skrillex"); //adds to the beginning
   System.out.println("(2) " + list);
   
   list.add("Mastadon"); //adds to the end of the list
   System.out.println("(3) " + list);
   
   list.add("Illenium");
   System.out.println("(4) " + list);
   
   list.add(2, "Midnight Tyrannosaurus"); //adds it to the list @ index 2
   System.out.println("(5) " + list);
   
   list.add(5, "Flume"); // adds it to the list @ index 5
   System.out.println("(6) " + list);
   
   //removes elements from the list
   list.remove("Midnight Tyrannosaurus"); // same as .remove(1);
   System.out.println("(7) " + list);
   
   list.remove(2); //removes the element @ index 2
   System.out.println("(8) " + list);
   
   list.remove(list.size() - 1); //removes the last element
   System.out.println("(9) " + list);
   
   for(String s : list)
   System.out.println(s.toUpperCase() + " ");   
   
   }
}