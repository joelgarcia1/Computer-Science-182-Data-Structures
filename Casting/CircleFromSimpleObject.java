public class CircleFromSimpleObject extends SimpleGeometricObject
{

private double radius;
//initaliaze default
public CircleFromSimpleObject()
   { 
   }
   
   public CircleFromSimpleObject(double radius)
   {
   this.radius = radius;
   }
   
   public CircleFromSimpleObject(double radius, String color, boolean filled)
   {
   this.radius = radius;
   setColor(color);
   setFilled(filled);
   }
   
   public double getRadius()
   {
   return radius;
   }
   
   public void setRadius(double radius) //r = radius
   {
   this.radius = radius;
   }
   
   //gets area of circle
   public double getArea()
   {
   return radius * radius * Math.PI;
   }
   
   //gets Diameter of circle
   public double getDiameter()
   {
   return 2* radius;
   }
   // gets the parameter of the circle
   public double getParameter()
   {
   return 2 * radius * Math.PI;
   }
   
   //print circle
   public void printCircle()
   {
   System.out.println("The Circle is Created on " + " " +
   getDateCreated() + " and the radius is: " + radius);
   
   } 
}