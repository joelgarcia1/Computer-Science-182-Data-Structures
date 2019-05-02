import java.util.Scanner;
public class Test
{
   public static void main(String []args)
   {
   Scanner get = new Scanner(System.in);
   System.out.println("Enter n:");
   int n = get.nextInt();
   print(countDigits(n));
  printReverse(n);
   }
   
   public static int countDigits(int n)
   {

   if(n<10)
      return 1;
      else 
      return 1 + countDigits(n/10);
   }
   
   public static int print(int n)
   {
   
    System.out.println(n);
    return n;
   }
   
   public static void printReverse(int n)
   {
   if(n<10)
   System.out.println(n);
   else
   {
   System.out.print(n%10);
   printReverse(n/10);
   }
   }

}