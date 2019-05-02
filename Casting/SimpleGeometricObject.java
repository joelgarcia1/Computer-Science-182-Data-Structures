public class SimpleGeometricObject
{
private String color = " white ";
private boolean filled;
private java.util.Date dateCreated;

//construct a default geometric object
public SimpleGeometricObject()
   {
   dateCreated = new java.util.Date(); 
   
   }

/**Construct a geometric object with the specified color
 and fills a value */
 public SimpleGeometricObject(String s, boolean filled)
   {
 dateCreated = new java.util.Date();
 s = color;
 this.filled = filled;  //this is for this methods boolean = to private boolean
   }

 public String getColor()
   {
 return color; //from the top
   }

 public void setColor(String color)
   {
 this.color = color;
   }
/*Returns filled. Since filled is boolean,
   its getter method is named isFilled */
 public boolean isFilled()
   {
 return filled;
   }
   
   // Set a new filled
   public void setFilled(boolean filled)
   {
   this.filled = filled;
   }
   
   // get date created
   public java.util.Date getDateCreated() 
   {
   return dateCreated;
   }
   
   // Created the string representation of this object 
   public String toString()
   {
   return " Created on " +  dateCreated + " \ncolor "
   + color + " and filled " + filled;
   }
}  