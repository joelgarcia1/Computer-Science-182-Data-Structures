
public class Person 
{
   String firstName;
   String lastName;

   public String getFirstName() 
   {
      return firstName;
   }

   public String getLastName() 
   {
      return lastName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getFullName() 
   {
      return this.firstName + " " + this.lastName;
   }
}