
public class Teacher extends Person implements Displayable
 {
    String subject;
    Teacher(String subject, String firstName, String lastName)
     {
      this.subject = subject;
      this.firstName = firstName;
      this.lastName = lastName;
     }

   @Override
   public String display() 
   {
     return this.getFullName() + " teaches " + this.subject +"\n";
   }
}