
import java.util.*;

public class PrintReports
{

   public PrintReports() 
   {

   }



   public ArrayList<Displayable> enterClassroom() 
   {   
    ArrayList<Displayable> collection = new ArrayList<>();
    int roomNumber;
    Displayable teacher;
    ArrayList<Displayable> student;
    String New = "y";

    Scanner get = new Scanner(System.in);
   
   do {
      System.out.printf("Enter number of room:");
      roomNumber = get.nextInt();
      teacher = enterTeacher();
      student = enterStudents();
   
   if (roomNumber >= 100) 
   {
   collection.add(new Classroom(roomNumber, teacher, student));
   }


   else {
   System.out.printf("Room number must be greater than 100.");
   }

   System.out.printf("Do you want to continue classroom entries(y/n)?");
   New = get.next();
   } 
   
   while (!New.equalsIgnoreCase("n"));
   return collection;
   }

   
   public Displayable enterTeacher() 
   {
   String subject;
   String firstName;
   String lastName;
   Scanner get = new Scanner(System.in);
   System.out.printf("Enter subject: ");
   subject = get.next();
   System.out.printf("Enter teacher first name: ");
   firstName = get.next();
   System.out.printf("Enter teacher last name: ");
   lastName = get.next();
   
   return new Teacher(subject, firstName, lastName);
   }

   public ArrayList<Displayable> enterStudents()
   {
   ArrayList<Displayable> collection = new ArrayList<>();
   int studentId;
   int finalGrade;
   String firstName;
   String lastName;
   String New = "y";
   Scanner get = new Scanner(System.in);

   do {
      System.out.printf("Enter student id: ");
      studentId = get.nextInt();
      System.out.printf("Enter student first name: ");
      firstName = get.next();
      System.out.printf("Enter student last name: ");
      lastName = get.next();
      System.out.printf("Enter final grade: ");
      finalGrade = get.nextInt();

   if (studentId > 0) 
   {
   collection.add(new Student(firstName, lastName, studentId, finalGrade));
   }


   else 
   {
   System.out.printf("Student ID must be greater than 0. skipping entries ");
   }

   System.out.printf("Do you want to continue student entries(y/n)? ");
   New = get.next(); 
   
   } 
   while (!New.equalsIgnoreCase("n"));
   return collection;
  }

   void report(ArrayList<Displayable> rep) 
   {
   for (Displayable aRep : rep) 
   {
   System.out.println("______________________________________________________");
   System.out.println(aRep.display());
   System.out.println("______________________________________________________");
 
   
   }
   }
}
