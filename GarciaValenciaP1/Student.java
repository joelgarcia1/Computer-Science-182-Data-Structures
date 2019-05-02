
public class Student extends Person implements Displayable 
{
  int studentId;
  int finalGrade;

   Student(String firstName, String lastName, int studentId, int finalGrade)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.studentId = studentId;
      this.finalGrade = finalGrade;
   }

   public void setStudentId(int studentId)
   {
      this.studentId = studentId;
   }

   public int getStudentId()
   {
      return studentId;
   }

   public int getFinalGrade()
   {
      return finalGrade;
   }

   public void setFinalGrade(int finalGrade) 
   {
      this.finalGrade = finalGrade;
   }

   @Override
   public String display() 
   {
      return "Student ID: "+ this.studentId +" " + this.firstName + " " + this.lastName + " Final Grade: " + this.finalGrade +"\n";
   }
}