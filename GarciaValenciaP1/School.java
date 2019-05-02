/* 
Joel Garcia Valencia
Lab01
2pm
*/

public class School
{

   public static void main(String[] args)
   {
   
   try {
         PrintReports PR = new PrintReports();
         PR.report(PR.enterClassroom());
       }
      catch (Exception e) 
      { 
      System.out.println(e.toString());
      }
   }
}