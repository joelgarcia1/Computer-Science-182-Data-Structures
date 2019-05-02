
import java.util.ArrayList;

public class Classroom extends Person implements Displayable
{
   Displayable teacher;
   int roomNumber;
   ArrayList<Displayable> students;

   Classroom(int roomNumber, Displayable teacher, ArrayList <Displayable> students) 
   {
   this.roomNumber = roomNumber;
   this.teacher = teacher;
   this.students = students;
   }

@Override
   public String display()
   {
     StringBuilder Number = new StringBuilder();
     Number.append("Room Number: ").append(this.roomNumber +"\n");
     Number.append(teacher.display());

     for(Displayable student : students) 
     {
     Number.append(student.display());
     }

   return Number.toString();
   }
}